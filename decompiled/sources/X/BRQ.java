package X;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BRQ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BRQ[] A01;
    public static final BRQ A02;
    public static final BRQ A03;
    public static final BRQ A04;
    public static final BRQ A05;
    public static final BRQ A06;
    public final int drawableId;
    public final Object key;
    public final int stringId;

    static {
        BRQ brq = new BRQ(C7dq.A02, "Cut", 0, R.string.cut, R.attr.actionModeCutDrawable);
        A04 = brq;
        BRQ brq2 = new BRQ(C7dq.A01, "Copy", 1, R.string.copy, R.attr.actionModeCopyDrawable);
        A03 = brq2;
        BRQ brq3 = new BRQ(C7dq.A03, "Paste", 2, R.string.paste, R.attr.actionModePasteDrawable);
        A05 = brq3;
        BRQ brq4 = new BRQ(C7dq.A04, "SelectAll", 3, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        A06 = brq4;
        BRQ brq5 = new BRQ(C7dq.A00, "Autofill", 4, R.string.autofill, 0);
        A02 = brq5;
        BRQ[] brqArr = {brq, brq2, brq3, brq4, brq5};
        A01 = brqArr;
        A00 = C3cG.A0w(brqArr);
    }

    public static BRQ valueOf(String str) {
        return (BRQ) Enum.valueOf(BRQ.class, str);
    }

    public static BRQ[] values() {
        return (BRQ[]) A01.clone();
    }

    public BRQ(Object obj, String str, int i, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }
}
