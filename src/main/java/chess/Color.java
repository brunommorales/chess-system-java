package chess;

import java.util.List;
import java.util.stream.Collector;

public enum Color {
    BLACK,
    WHITE;

    public Color collect(Collector<Object,?, List<Object>> list) {
        return null;
    }
}
