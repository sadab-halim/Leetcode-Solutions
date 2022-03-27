ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                continue;
            }

            node = node.next;
        }

        if (head != null && head.val == val) {
            return head.next;
        }

        return head;
    }