package X;

import X.AbstractC9340GEx;
import X.GH6;

/* renamed from: X.GEx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9340GEx<MessageType extends AbstractC9340GEx<MessageType, BuilderType>, BuilderType extends GH6<MessageType, BuilderType>> implements GH2 {
    public int memoizedHashCode = 0;

    public static int A04(InterfaceC9366GGc interfaceC9366GGc, Object obj) {
        AbstractC9340GEx abstractC9340GEx = (AbstractC9340GEx) obj;
        AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) abstractC9340GEx;
        int i = abstractC9339GEw.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iAKR = interfaceC9366GGc.AKR(abstractC9340GEx);
        abstractC9339GEw.memoizedSerializedSize = iAKR;
        return iAKR;
    }
}
