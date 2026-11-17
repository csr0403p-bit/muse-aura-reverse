package X;

/* renamed from: X.1YD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YD {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1YD) && this.A00 == ((C1YD) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
