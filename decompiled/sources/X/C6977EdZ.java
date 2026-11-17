package X;

import java.io.IOException;
import org.jsoup.SerializationException;

/* renamed from: X.EdZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6977EdZ extends Hy9 {
    public final Appendable A00;

    @Override // X.Hy9
    public final /* bridge */ /* synthetic */ void A01(char c) throws IOException {
        try {
            this.A00.append(c);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    @Override // X.Hy9
    public final /* bridge */ /* synthetic */ void A02(CharSequence charSequence) throws IOException {
        try {
            this.A00.append(charSequence);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    @Override // X.Hy9
    public final void A03(char[] cArr, int i, int i2) throws IOException {
        try {
            this.A00.append(new String(cArr, i, i2));
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public C6977EdZ(Appendable appendable) {
        this.A00 = appendable;
    }
}
