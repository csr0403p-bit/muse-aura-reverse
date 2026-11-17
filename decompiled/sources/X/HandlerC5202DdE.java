package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.DdE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC5202DdE extends Handler {
    public static final Object A0F = C3cG.A0T();
    public int A00;
    public int A01;
    public Message A02;
    public C5211DdN A03;
    public C5211DdN A04;
    public C5214DdQ A05;
    public C5212DdO A06;
    public C5213DdP A07;
    public C5201DdD A08;
    public ArrayList<Message> A09;
    public HashMap<C5211DdN, C5209DdL> A0A;
    public boolean A0B;
    public C5209DdL[] A0C;
    public C5209DdL[] A0D;
    public boolean A0E;

    public static final void A00(C5211DdN c5211DdN, HandlerC5202DdE handlerC5202DdE) {
        HashMap<C5211DdN, C5209DdL> map = handlerC5202DdE.A0A;
        C5209DdL c5209DdL = map.get(c5211DdN);
        if (c5209DdL == null) {
            c5209DdL = new C5209DdL(handlerC5202DdE);
            map.put(c5211DdN, c5209DdL);
        }
        c5209DdL.A00 = c5211DdN;
        c5209DdL.A01 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fa, code lost:
    
        if (r1 != 11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r1 != 14) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x012a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[DONT_GENERATE] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC5202DdE.handleMessage(android.os.Message):void");
    }
}
