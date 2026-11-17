package X;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* renamed from: X.9iQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iQ<T extends Enum<T>> implements C9hr<T> {
    public C9iZ A00;
    public final T[] A01;
    public final F0C A02;

    public C9iQ(String str, T[] tArr) {
        C7384Etj.A0Y(tArr, 1);
        this.A01 = tArr;
        this.A02 = AbstractC5321DgF.A03(new C2303BTd(str, this, 1));
    }

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        int iA8O = interfaceC07829iw.A8O(getDescriptor());
        if (iA8O >= 0) {
            T[] tArr = this.A01;
            if (iA8O < tArr.length) {
                return tArr[iA8O];
            }
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(iA8O);
        sbA0w.append(" is not among valid ");
        sbA0w.append(getDescriptor().AKP());
        sbA0w.append(" enum values, values size is ");
        sbA0w.append(this.A01.length);
        throw new SerializationException(sbA0w.toString());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return (C9iZ) this.A02.getValue();
    }

    public final String toString() {
        return FGI.A0N("kotlinx.serialization.internal.EnumSerializer<", getDescriptor().AKP(), '>');
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        T[] tArr = this.A01;
        int iA09 = BFI.A09(tArr, obj);
        if (iA09 != -1) {
            interfaceC07789is.AAE(getDescriptor(), iA09);
            return;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(obj);
        sbA0w.append(" is not a valid enum ");
        sbA0w.append(getDescriptor().AKP());
        sbA0w.append(", must be one of ");
        String string = Arrays.toString(tArr);
        C7384Etj.A0U(string);
        throw new SerializationException(AnonymousClass001.A0v(string, sbA0w));
    }
}
