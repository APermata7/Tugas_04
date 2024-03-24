package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    
    public LCD() {
        this.status = "mati"; // Default status adalah mati saat LCD dibuat
        this.volume = 0; // Default volume adalah 0 saat LCD dibuat
        this.brightness = 0; // Default brightness adalah 0 saat LCD dibuat
        this.cable = ""; // Menambahkan jenis kabel yang tersedia
    }

    // Setter untuk mengubah status LCD menjadi mati
    public void turnOff() {
        this.status = "Mati";
    }

    // Setter untuk mengubah status LCD menjadi menyala
    public void turnOn() {
        this.status = "Menyala";
    }

    // Setter untuk mengubah status LCD menjadi Freeze
    public void Freeze() {
        this.status = "Freeze";
    }

    // Method untuk menaikkan volume suara
    public void volumeUp() {
        this.volume++;
    }

    // Method untuk menurunkan volume suara
    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        } 
    }

    // Setter untuk mengatur volume suara
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Method untuk menaikkan tingkat kecerahan layar LCD
    public void brightnessUp() {
        this.brightness++;
    }

    // Method untuk menurunkan tingkat kecerahan layar LCD
    public void brightnessDown() {
        if (this.brightness > 0) {
            this.brightness--;
        } 
    }

    // Setter untuk mengatur tingkat kecerahan layar LCD
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    // Setter untuk mengatur kabel yang digunakan berdasarkan indeks
    public void setCable(int option) {
        String[] cables = {"VGA", "DVI", "HDMI", "DisplayPort"};
        
        if (option >= 0 && option < cables.length) {
            this.cable = cables[option];
        } else {
            System.out.println("Invalid option");
        }
    }

    // Method untuk menampilkan pesan tentang keadaan LCD
    public void displayMessage() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable); // Menggunakan status sebagai kabel yang sedang digunakan
    }
}