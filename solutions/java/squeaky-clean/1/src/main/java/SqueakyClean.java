class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder s = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : identifier.toCharArray()) {

            if (Character.isWhitespace(ch)) {
                s.append('_');
                capitalizeNext = false;
            }

            else if (ch == '-') {
                capitalizeNext = true;
            }

            else {
                char converted = ch;
                switch (ch) {
                    case '4': converted = 'a'; break;
                    case '3': converted = 'e'; break;
                    case '0': converted = 'o'; break;
                    case '1': converted = 'l'; break;
                    case '7': converted = 't'; break;
                }

                if (Character.isLetter(converted) || converted == '_') {
                    if (capitalizeNext) {
                        s.append(Character.toUpperCase(converted));
                        capitalizeNext = false;
                    } else {
                        s.append(converted);
                    }
                }
            }
        }

        return s.toString();
    }
}
