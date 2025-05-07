package lab7.Zadanie6;

public class TransformacjaString {
    public String usunZnaki(String tekst, Znak znak){
        String zamien = switch (znak) {
            case LICZBA -> "[0-9]";
            case SPACJA -> " ";
            case SAMOGLOSKA -> "[aAeEiIoOuUyY]";
            case SPOLGLOSKA -> "[qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]";
            case ZNAK_SPECJALNY -> "[!@#$%^&*()_+-=?.,]";
        };
        return tekst.replaceAll(zamien, "");
    }
    public String podmienZnaki(String tekst, Znak znak, Character symbol){
        String zamien = switch (znak) {
            case LICZBA -> "[0-9]";
            case SPACJA -> " ";
            case SAMOGLOSKA -> "[aAeEiIoOuUyY]";
            case SPOLGLOSKA -> "[qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]";
            case ZNAK_SPECJALNY -> "[!@#$%^&*()_+-=?.,]";
        };
        return tekst.replaceAll(zamien, symbol.toString());
    }
    public String pozostawZnaki(String tekst, Znak znak){
        String zamien = switch (znak) {
            case LICZBA -> "[^0-9]";
            case SPACJA -> "[^ ]";
            case SAMOGLOSKA -> "[^aAeEiIoOuUyY]";
            case SPOLGLOSKA -> "[^qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]";
            case ZNAK_SPECJALNY -> "[^!@#$%^&*()_+-=?.,]";
        };
        return tekst.replaceAll(zamien, "");
    }
}