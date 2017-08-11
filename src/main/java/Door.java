class Door {

    public enum State {CLOSED, OPEN}

    private State state;

    Door(State state) {
        this.state = state;
    }

    void toggleState() {
        state = (state == State.CLOSED ? State.OPEN : State.CLOSED);
    }

    State getState() {
        return state;
    }
}
