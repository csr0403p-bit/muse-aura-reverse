package X;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class Ed1 extends ThreadLocal<Mac> {
    public final /* synthetic */ Ed0 A00;

    public Ed1(final Ed0 this$0) {
        this.A00 = this$0;
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Mac initialValue() throws InvalidKeyException {
        try {
            AF2<AF1, Mac> af2 = AF2.A05;
            Ed0 ed0 = this.A00;
            EnumC7335ElD enumC7335ElD = Ed0.A04;
            Mac macAGa = af2.A00.AGa(ed0.A00);
            macAGa.init(ed0.A01);
            return macAGa;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
