class Node {
public:
    int key, value;
    Node* next;
    Node* prev;

    Node(int k, int v) : key(k), value(v), next(nullptr), prev(nullptr) {}
};

class LRUCache {
private:
    map<int, Node*> hash;
    int cap;
    Node* head, *tail;

public:
    LRUCache(int capacity) : cap(capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head->next = tail;
        tail->prev = head;
    }
    
    int get(int key) {
        if(hash.find(key) == hash.end()) return -1;

        Node* node = hash[key];
        deleteNode(node);
        insertAtHead(node);

        return node->value;
    }
    
    void put(int key, int value) {
        if(hash.find(key) != hash.end()) {
            Node* node = hash[key];
            deleteNode(node);
            insertAtHead(node);
            node->value = value;
        } else {
            if(hash.size() >= cap) {
                Node* node = tail->prev;
                deleteNode(node);
                hash.erase(node->key);
            }

            Node* node = new Node(key, value);
            hash[key] = node;
            insertAtHead(node);
        }
    }

    void insertAtHead(Node* node) {
        Node* currAfterHead = head->next;
        head->next = node;
        node->prev = head;
        node->next = currAfterHead;
        currAfterHead->prev = node;
    }

    void deleteNode(Node* node) {
        Node* prevNode = node->prev;
        Node* afterNode = node->next;

        prevNode->next = afterNode;
        afterNode->prev = prevNode;
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */