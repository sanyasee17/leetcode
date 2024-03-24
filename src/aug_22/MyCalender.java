package aug_22;

// https://leetcode.com/problems/my-calendar-i/

public class MyCalender {

    Event headEvent;

    public MyCalender(Event headEvent) {
        this.headEvent = null;
    }

    public boolean book(int start, int end) {
        if(headEvent == null ){
            headEvent = new Event(start, end);
            return true;
        } else {
            return insert(headEvent, start, end);
        }
    }

    boolean insert(Event headEvent, int start, int end) {

        // Case 1 : add to left side
        if(headEvent.start >= end){
            if(headEvent.left == null) {
                headEvent.left = new Event(start, end);
                return true;
            } else {
                return insert(headEvent.left, start, end);
            }
        }

        // Case 2 : add to right side
        if(headEvent.end <= start) {
            if(headEvent.right == null) {
                headEvent.right = new Event(start, end);
                return true;
            } else {
                return insert(headEvent.right, start, end);
            }
        }
        return false;
    }

    private class Event {
        int start;
        int end;
        Event left;
        Event right;

        public Event(int start, int end) {
            this.start = start;
            this.end = end;
            left = null;
            right = null;
        }
    }

}
