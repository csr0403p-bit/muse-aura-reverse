package X;

import X.GHM;
import X.GHW;

/* loaded from: classes6.dex */
public abstract class GHW<MessageType extends GHM<MessageType, BuilderType>, BuilderType extends GHW<MessageType, BuilderType>> extends AbstractC9393GHi<MessageType, BuilderType> {
    public MessageType A00;
    public final MessageType A01;

    public final BuilderType A01() {
        BuilderType buildertype = (BuilderType) GHS.A09(this.A01);
        buildertype.A00 = (MessageType) A03();
        return buildertype;
    }

    public final MessageType A03() {
        MessageType messagetype = this.A00;
        if ((messagetype.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            return messagetype;
        }
        AbstractC7609F5w.A0d(messagetype).AQ3(messagetype);
        messagetype.memoizedSerializedSize &= Integer.MAX_VALUE;
        return this.A00;
    }

    public final void A04() {
        if ((this.A00.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            MessageType messagetype = (MessageType) this.A01.A0E(C79.A0K);
            AbstractC7609F5w.A0d(messagetype).AQb(messagetype, this.A00);
            this.A00 = messagetype;
        }
    }

    public GHW(MessageType defaultInstance) {
        this.A01 = defaultInstance;
        if ((defaultInstance.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            throw C60O.A0i("Default instance must be immutable.");
        }
        this.A00 = (MessageType) defaultInstance.A0E(C79.A0K);
    }

    public static GHM A00(GHW ghw) {
        ghw.A04();
        return ghw.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r1 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType A02() {
        /*
            r2 = this;
            X.GHM r2 = r2.A03()
            java.lang.Integer r0 = X.C79.A00
            java.lang.Object r0 = r2.A0E(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L24
            if (r1 == 0) goto L25
            X.GHV r0 = X.AbstractC7609F5w.A0d(r2)
            boolean r1 = r0.AOY(r2)
            java.lang.Integer r0 = X.C79.A01
            r2.A0E(r0)
            if (r1 == 0) goto L25
        L24:
            return r2
        L25:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GHW.A02():X.GHM");
    }
}
