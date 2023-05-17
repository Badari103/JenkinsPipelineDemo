package org.example;

class SequenceOfCharacters {
    final String value;

    public SequenceOfCharacters(String value) {
        this.value = value;
    }

    public int length() {
        int len = 0;
        for (char letter : value.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                len += 1;
            }
        }
        return len;
    }
}
