package X;

import androidx.media3.extractor.text.SubtitleDecoderException;

/* loaded from: classes5.dex */
public abstract class E04 extends AbstractC6191Dxb<E0B, E0M, SubtitleDecoderException> implements E09 {
    public E04() {
        super(new E0B[2], new E0M[2]);
        int i = this.A00;
        Di2[] di2Arr = this.A0A;
        C1G.A08(AnonymousClass002.A1Q(i, di2Arr.length));
        for (Di2 di2 : di2Arr) {
            di2.A04(1024);
        }
    }

    @Override // X.E09
    public final void Ae9(long j) {
    }
}
