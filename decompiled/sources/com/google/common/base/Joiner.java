package com.google.common.base;

import X.BV4;
import X.BV8;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class Joiner {
    public final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public final StringBuilder appendTo(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            if (parts.hasNext()) {
                while (true) {
                    Object next = parts.next();
                    builder.append(BV8.A0k(next, next));
                    if (!parts.hasNext()) {
                        break;
                    }
                    builder.append((CharSequence) this.separator);
                }
            }
            return builder;
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }
}
