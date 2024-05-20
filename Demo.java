class PatientQueue {
    private Patient[] array;
    private int nextIndex;

    public PatientQueue() {
        this.array = new Patient[2];
        this.nextIndex = 0;
    }

    public void enQueue(Patient patient) {
        if (nextIndex >= array.length) {
            resizeArray();
        }
        this.array[nextIndex++] = patient;
    }

    public Patient deQueue() {
        Patient firstPatient = array[0];
        Patient[] tempArray = new Patient[nextIndex - 1];

        for (int i = 1; i < nextIndex; i++) {
            tempArray[i - 1] = array[i];
        }
        array = tempArray;
        nextIndex--;

        return firstPatient;
    }

    public void resizeArray() {
        Patient[] tempArray = new Patient[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
    }

    public void printQueue() {
        System.out.print("{");

        if (nextIndex <= 0) {
            System.out.println("Empty}");
        } else {
            for (int i = 0; i < nextIndex; i++) {
                System.out.print("[" + array[i].getId() + "-" + array[i].getName() + "], ");
            }
            System.out.println("\b\b}");
        }
    }

    public int size() {
        return nextIndex;
    }

    public void clear() {
        nextIndex = 0;
    }

}

class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPatientDetail() {
        return "[" + id + "-" + name + "]";
    }

}

class Demo {
    public static void main(String args[]) {
        PatientQueue queue = new PatientQueue();
        queue.enQueue(new Patient(101, "Amal"));
        queue.enQueue(new Patient(102, "Nimal"));
        queue.enQueue(new Patient(103, "Ramal"));
        queue.enQueue(new Patient(104, "Bimal"));
        queue.printQueue(); // {[101-Amal], [102-Niaml], [103-Ramal], [104-Bimal]}
        Patient firstPatient = queue.deQueue();
        System.out.println(firstPatient.getPatientDetail()); // [1001-Amal]
        queue.printQueue(); // {[102-Niaml], [103-Ramal], [104-Bimal]}
        System.out.println("No of patient of the queue : " + queue.size()); // 3
        queue.clear();
        queue.printQueue(); // {Empty}
        System.out.println("No of patient of the queue : " + queue.size()); // 0
    }
}