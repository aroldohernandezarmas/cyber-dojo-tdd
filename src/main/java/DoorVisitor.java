class DoorVisitor {
    Door[] visit(Door[] doors) {
        Door[] buffer = new Door[doors.length];
        for (int i = 0; i < doors.length; i++) {
            buffer[i] = new Door(doors[i].getState());
        }

        for (int i = 1; i <= doors.length; i++) {
            for (int j = 0; j < doors.length; j++) {
                if ((j + 1) % i == 0) {
                    buffer[j].toggleState();
                }
            }
        }

        return buffer;
    }
}
