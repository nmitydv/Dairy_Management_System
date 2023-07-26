package dairy_m;

import javax.swing.*;

public class myrowfilter extends RowFilter {
    private String text;

    myrowfilter(String text) {
        this.text = text;
    }

    public boolean include(Entry entry) {
        return entry.getStringValue(0).indexOf(text) >= 0;
    }
}
