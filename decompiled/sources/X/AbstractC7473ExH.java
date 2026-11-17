package X;

/* renamed from: X.ExH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7473ExH {
    public static final C06827l3 A00 = C06827l3.A02("^(.*?)(\\.config\\.(x86|x86_64|armeabi_v7a|arm64_v8a))$");

    public static final String A00(String str) {
        C06857lE c06857lE;
        C1YK c1ykA0E;
        C06847l8 c06847l8A01 = C06827l3.A01(str, A00);
        return (c06847l8A01 == null || (c06857lE = c06847l8A01.A02) == null || (c1ykA0E = c06857lE.A0E(1)) == null) ? str : c1ykA0E.A00;
    }
}
