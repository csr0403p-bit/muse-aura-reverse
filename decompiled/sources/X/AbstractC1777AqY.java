package X;

import android.graphics.Paint;

/* renamed from: X.AqY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1777AqY {
    public static final /* synthetic */ int[] A00;
    public static final /* synthetic */ int[] A01;

    static {
        Paint.Style.values();
        int[] iArr = new int[Paint.Cap.values().length];
        try {
            AnonymousClass005.A0v(Paint.Cap.BUTT, iArr, 1);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass005.A0v(Paint.Cap.ROUND, iArr, 2);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass005.A0v(Paint.Cap.SQUARE, iArr, 3);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        try {
            AnonymousClass005.A0v(Paint.Join.MITER, iArr2, 1);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass005.A0v(Paint.Join.BEVEL, iArr2, 2);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass005.A0v(Paint.Join.ROUND, iArr2, 3);
        } catch (NoSuchFieldError unused6) {
        }
        A01 = iArr2;
    }
}
