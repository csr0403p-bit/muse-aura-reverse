package X;

/* renamed from: X.9tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08299tp implements C9hr<C9zn> {
    public static final C08299tp A00 = new C08299tp();
    public static final C9iZ A01 = new C07709if("X.9zn", C07669ib.A00);

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0138, code lost:
    
        if (r3 != r21) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013c, code lost:
    
        if (r1 != r21) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0140, code lost:
    
        return X.C9zn.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
    
        return new X.C9zn(r3, r1);
     */
    @Override // X.C9jG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(X.InterfaceC07829iw r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08299tp.deserialize(X.9iw):java.lang.Object");
    }

    public static final void A00(String str, String str2, int i) {
        StringBuilder sbA0x = C3cI.A0x("Expected ", str2);
        sbA0x.append(" at index ");
        sbA0x.append(i);
        sbA0x.append(", but was '");
        sbA0x.append(str.charAt(i));
        throw C60O.A0i(C8j3.A16(sbA0x, '\''));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        interfaceC07789is.AAU(obj.toString());
    }
}
