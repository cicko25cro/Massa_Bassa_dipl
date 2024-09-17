package com.example.massa_bassa_dipl;
public class AmpsClass {
    private String name;
    private int imageResource;
    private String size; // Promijenjeno u centimetrima
    private String amplifierType; // Tip pojačala
    private String amplifierClass; // Klasa pojačala
    private String signalToNoiseRatio; // Omjer signala i šuma
    private String inputSensitivity; // Osetljivost ulaza
    private String lowPassCrossover; // Niskopropusni crossover
    private String highPassCrossover; // Visokopropusni crossover
    private String fuse; // Osigurač
    private String operatingVoltage; // Radni napon
    private String powerAt4Ohm; // Snaga @ 4 Ω 14.4 V
    private String powerAt2Ohm; // Snaga @ 2 Ω 14.4 V
    private String powerAt1Ohm; // Snaga @ 1 Ω 14.4 V
    private double price;
    private String description;
    private float rating;

    public AmpsClass(String name, int imageResource, String size, String amplifierType, String amplifierClass,
                     String signalToNoiseRatio, String inputSensitivity, String lowPassCrossover, String highPassCrossover,
                     String fuse, String operatingVoltage, String powerAt4Ohm, String powerAt2Ohm, String powerAt1Ohm,
                     double price, String description, float rating) {
        this.name = name;
        this.imageResource = imageResource;
        this.size = size;
        this.amplifierType = amplifierType;
        this.amplifierClass = amplifierClass;
        this.signalToNoiseRatio = signalToNoiseRatio;
        this.inputSensitivity = inputSensitivity;
        this.lowPassCrossover = lowPassCrossover;
        this.highPassCrossover = highPassCrossover;
        this.fuse = fuse;
        this.operatingVoltage = operatingVoltage;
        this.powerAt4Ohm = powerAt4Ohm;
        this.powerAt2Ohm = powerAt2Ohm;
        this.powerAt1Ohm = powerAt1Ohm;
        this.price = price;
        this.description = description;
        this.rating = rating;
    }

    public String getPriceWithCurrency() {
        return "Price: " + "€" + price;
    }
    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return "Size: " + size + " cm";
    }
    public String getDescription() {
        return description;
    }
    public float getRating() {
        return rating;
    }
    public String getAmplifierType() { return amplifierType; }
    public String getAmplifierClass() { return amplifierClass + " Class";}
    public String getSignalToNoiseRatio() {
        if (signalToNoiseRatio.equals("N/A") || signalToNoiseRatio.equals("-||-")) {
            return "Signal to noise ratio:" + signalToNoiseRatio;
        } else {
            return "Signal to noise ratio:" + signalToNoiseRatio + "dB";
        }
    }
    public String getInputSensitivity() {
        if (inputSensitivity.equals("N/A") || inputSensitivity.equals("-||-")) {
            return "Input Sensitivity: " + inputSensitivity;
        } else {
            return "Input Sensitivity: " + inputSensitivity + " V";
        }
    }
    public String getLowPassCrossover() {
        if (lowPassCrossover.equals("N/A") || lowPassCrossover.equals("-||-")) {
            return "Low Pass Crossover: " + lowPassCrossover;
        } else {
            return "Low Pass Crossover: " + lowPassCrossover + " Hz";
        }
    }
    public String getHighPassCrossover() {
        if (highPassCrossover.equals("N/A") || highPassCrossover.equals("-||-")) {
            return "High Pass Crossover: " + highPassCrossover;
        } else {
            return "High Pass Crossover: " + highPassCrossover + " Hz";
        }
    }
    public String getFuse() {
        if (fuse.equals("N/A") || fuse.equals("-||-")) {
            return "Fuse: " + fuse;
        } else {
            return "Fuse: " + fuse + "A";
        }
}
    public String getOperatingVoltage() {
        if (operatingVoltage.equals("N/A") || operatingVoltage.equals("-||-")) {
            return "Operating voltage: " + operatingVoltage;
        } else {
            return "Operating voltage: " + operatingVoltage + "V";
        }
    }

    public String getPowerAt4Ohm() {
        if (powerAt4Ohm.equals("N/A") || powerAt4Ohm.equals("-||-")) {
            return "Power at 4 Ohm: " + powerAt4Ohm;
        } else {
            return "Power at 4 Ohm: " + powerAt4Ohm + " Watts RMS";
        }
    }

    public String getPowerAt2Ohm() {
        if (powerAt2Ohm.equals("N/A") || powerAt2Ohm.equals("-||-")) {
            return "Power at 2 Ohm: " + powerAt2Ohm;
        } else {
            return "Power at 2 Ohm: " + powerAt2Ohm + " Watts RMS";
        }
    }

    public String getPowerAt1Ohm() {
        if (powerAt1Ohm.equals("N/A") || powerAt1Ohm.equals("-||-")) {
            return "Power at 1 Ohm: " + powerAt1Ohm;
        } else {
            return "Power at 1 Ohm: " + powerAt1Ohm + " Watts RMS";
        }
    }

}