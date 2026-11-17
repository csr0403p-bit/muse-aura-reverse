package X;

import X.AbstractC9339GEw;
import X.GGW;

/* loaded from: classes6.dex */
public abstract class GGW<MessageType extends AbstractC9339GEw<MessageType, BuilderType>, BuilderType extends GGW<MessageType, BuilderType>> extends GH6<MessageType, BuilderType> {
    public MessageType A00;
    public boolean A01 = false;
    public final MessageType A02;

    public static AbstractC9339GEw A00(GGW ggw) {
        boolean z = ggw.A01;
        MessageType messagetype = ggw.A00;
        if (z) {
            return messagetype;
        }
        GGS.A02.A00(messagetype.getClass()).AQ3(messagetype);
        ggw.A01 = true;
        return ggw.A00;
    }

    public final void A02() {
        if (this.A01) {
            MessageType messagetype = (MessageType) this.A00.A04(C79.A0K);
            AbstractC7609F5w.A0T(messagetype).AQb(messagetype, this.A00);
            this.A00 = messagetype;
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC9341GEy
    public final /* bridge */ /* synthetic */ AbstractC9339GEw AEi() {
        return this.A02;
    }

    @Override // X.GH6
    public final /* bridge */ /* synthetic */ Object clone() {
        GGW ggw = (GGW) this.A02.A04(C79.A0P);
        AbstractC9339GEw abstractC9339GEwA00 = A00(this);
        ggw.A02();
        MessageType messagetype = ggw.A00;
        AbstractC7609F5w.A0T(messagetype).AQb(messagetype, abstractC9339GEwA00);
        return ggw;
    }

    public GGW(MessageType messagetype) {
        this.A02 = messagetype;
        this.A00 = (MessageType) messagetype.A04(C79.A0K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r1 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType A01() {
        /*
            r2 = this;
            X.GEw r2 = A00(r2)
            java.lang.Integer r0 = X.C79.A00
            java.lang.Object r0 = r2.A04(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L24
            if (r1 == 0) goto L25
            X.GGc r0 = X.AbstractC7609F5w.A0T(r2)
            boolean r1 = r0.AOY(r2)
            java.lang.Integer r0 = X.C79.A01
            r2.A04(r0)
            if (r1 == 0) goto L25
        L24:
            return r2
        L25:
            androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = new androidx.datastore.preferences.protobuf.UninitializedMessageException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGW.A01():X.GEw");
    }
}
