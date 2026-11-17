package X;

import X.GF2;
import X.GF3;

/* loaded from: classes6.dex */
public abstract class GF3<MessageType extends GF2<MessageType, BuilderType>, BuilderType extends GF3<MessageType, BuilderType>> extends AbstractC10480Hkv<MessageType, BuilderType> {
    public MessageType A00;
    public final MessageType A01;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r1 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType A00() {
        /*
            r3 = this;
            MessageType extends X.GF2<MessageType, BuilderType> r2 = r3.A00
            int r1 = r2.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 == 0) goto L11
            r2.A07()
            MessageType extends X.GF2<MessageType, BuilderType> r2 = r3.A00
        L11:
            java.lang.Integer r0 = X.C79.A00
            java.lang.Object r0 = r2.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L31
            if (r1 == 0) goto L32
            X.GF4 r0 = X.AbstractC7609F5w.A0X(r2)
            boolean r1 = r0.AOY(r2)
            java.lang.Integer r0 = X.C79.A01
            r2.A06(r0)
            if (r1 == 0) goto L32
        L31:
            return r2
        L32:
            androidx.health.platform.client.proto.UninitializedMessageException r0 = new androidx.health.platform.client.proto.UninitializedMessageException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GF3.A00():X.GF2");
    }

    public final void A01() {
        if (AbstractC7609F5w.A1U(this.A00.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return;
        }
        MessageType messagetype = (MessageType) this.A01.A06(C79.A0K);
        AbstractC7609F5w.A0X(messagetype).AQb(messagetype, this.A00);
        this.A00 = messagetype;
    }

    @Override // X.AbstractC10480Hkv
    public final /* bridge */ /* synthetic */ Object clone() {
        GF3 gf3 = (GF3) this.A01.A06(C79.A0P);
        MessageType messagetype = this.A00;
        if (AbstractC7609F5w.A1U(messagetype.memoizedSerializedSize, Integer.MIN_VALUE)) {
            messagetype.A07();
            messagetype = this.A00;
        }
        gf3.A00 = messagetype;
        return gf3;
    }

    public GF3(MessageType defaultInstance) {
        this.A01 = defaultInstance;
        if (AbstractC7609F5w.A1U(defaultInstance.memoizedSerializedSize, Integer.MIN_VALUE)) {
            throw C60O.A0i("Default instance must be immutable.");
        }
        this.A00 = (MessageType) defaultInstance.A06(C79.A0K);
    }
}
