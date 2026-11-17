package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class LogLine extends C06G {
    public static final int $stable = 0;
    public final int id;
    public final String text;

    public LogLine(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.id = i;
        this.text = str;
    }

    public final LogLine copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new LogLine(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LogLine) {
                LogLine logLine = (LogLine) obj;
                if (this.id != logLine.id || !C7384Etj.areEqual(this.text, logLine.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LogLine copy$default(LogLine logLine, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = logLine.id;
        }
        if ((i2 & 2) != 0) {
            str = logLine.text;
        }
        C7384Etj.A0Y(str, 1);
        return new LogLine(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, this.id * 31);
    }

    public String toString() {
        return super.toString();
    }
}
