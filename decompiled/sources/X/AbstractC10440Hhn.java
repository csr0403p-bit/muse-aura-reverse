package X;

import X.AbstractC10440Hhn;
import X.GF0;

/* renamed from: X.Hhn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10440Hhn<MessageType extends GF0<MessageType, BuilderType>, BuilderType extends AbstractC10440Hhn<MessageType, BuilderType>> extends AbstractC10524Hor<MessageType, BuilderType> {
    public MessageType A00;
    public final MessageType A01;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r1 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType A00() {
        /*
            r3 = this;
            MessageType extends X.GF0<MessageType, BuilderType> r2 = r3.A00
            int r1 = r2.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 == 0) goto L1d
            X.GG0 r0 = X.AbstractC7609F5w.A0V(r2)
            r0.AQ3(r2)
            int r1 = r2.memoizedSerializedSize
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r2.memoizedSerializedSize = r1
            MessageType extends X.GF0<MessageType, BuilderType> r2 = r3.A00
        L1d:
            java.lang.Integer r0 = X.C79.A00
            java.lang.Object r0 = r2.A05(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L3d
            if (r1 == 0) goto L3e
            X.GG0 r0 = X.AbstractC7609F5w.A0V(r2)
            boolean r1 = r0.AOY(r2)
            java.lang.Integer r0 = X.C79.A01
            r2.A05(r0)
            if (r1 == 0) goto L3e
        L3d:
            return r2
        L3e:
            androidx.glance.appwidget.protobuf.UninitializedMessageException r0 = new androidx.glance.appwidget.protobuf.UninitializedMessageException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10440Hhn.A00():X.GF0");
    }

    public final void A01() {
        if (AbstractC7609F5w.A1U(this.A00.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return;
        }
        MessageType messagetype = (MessageType) this.A01.A05(C79.A0K);
        AbstractC7609F5w.A0V(messagetype).AQb(messagetype, this.A00);
        this.A00 = messagetype;
    }

    @Override // X.AbstractC10524Hor
    public final /* bridge */ /* synthetic */ Object clone() {
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) this.A01.A05(C79.A0P);
        MessageType messagetype = this.A00;
        if (AbstractC7609F5w.A1U(messagetype.memoizedSerializedSize, Integer.MIN_VALUE)) {
            AbstractC7609F5w.A0V(messagetype).AQ3(messagetype);
            messagetype.memoizedSerializedSize &= Integer.MAX_VALUE;
            messagetype = this.A00;
        }
        abstractC10440Hhn.A00 = messagetype;
        return abstractC10440Hhn;
    }

    public AbstractC10440Hhn(MessageType defaultInstance) {
        this.A01 = defaultInstance;
        if (AbstractC7609F5w.A1U(defaultInstance.memoizedSerializedSize, Integer.MIN_VALUE)) {
            throw C60O.A0i("Default instance must be immutable.");
        }
        this.A00 = (MessageType) defaultInstance.A05(C79.A0K);
    }
}
