package com.google.common.base;

import X.BV4;
import X.BV7;
import X.C8j3;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class MoreObjects$ToStringHelper {
    public final String className;
    public final ValueHolder holderHead;
    public ValueHolder holderTail;

    public final class UnconditionalValueHolder extends ValueHolder {
    }

    public class ValueHolder {
        public String name;
        public ValueHolder next;
        public Object value;
    }

    private MoreObjects$ToStringHelper addUnconditionalHolder(String name, Object value) {
        UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
        this.holderTail.next = unconditionalValueHolder;
        this.holderTail = unconditionalValueHolder;
        unconditionalValueHolder.value = value;
        unconditionalValueHolder.name = name;
        return this;
    }

    public MoreObjects$ToStringHelper add(String name, Object value) {
        ValueHolder valueHolder = new ValueHolder();
        this.holderTail.next = valueHolder;
        this.holderTail = valueHolder;
        valueHolder.value = value;
        valueHolder.name = name;
        return this;
    }

    public MoreObjects$ToStringHelper addValue(Object value) {
        ValueHolder valueHolder = new ValueHolder();
        this.holderTail.next = valueHolder;
        this.holderTail = valueHolder;
        valueHolder.value = value;
        return this;
    }

    public String toString() {
        StringBuilder sbA0p = BV4.A0p(32);
        BV7.A1J(sbA0p, this.className);
        String str = "";
        for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
            Object obj = valueHolder.value;
            sbA0p.append(str);
            String str2 = valueHolder.name;
            if (str2 != null) {
                BV7.A1I(sbA0p, str2);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sbA0p.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sbA0p.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            str = ", ";
        }
        return C8j3.A15(sbA0p);
    }

    public MoreObjects$ToStringHelper(String className) {
        ValueHolder valueHolder = new ValueHolder();
        this.holderHead = valueHolder;
        this.holderTail = valueHolder;
        className.getClass();
        this.className = className;
    }

    public MoreObjects$ToStringHelper add(String name, int value) {
        addUnconditionalHolder(name, String.valueOf(value));
        return this;
    }

    public MoreObjects$ToStringHelper add(String name, long value) {
        addUnconditionalHolder(name, String.valueOf(value));
        return this;
    }

    public MoreObjects$ToStringHelper add(String name, boolean value) {
        addUnconditionalHolder(name, String.valueOf(value));
        return this;
    }
}
