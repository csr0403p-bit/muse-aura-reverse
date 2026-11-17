package X;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.util.Util;
import com.facebook.aura.partners.voice.session.impl.SessionControllerKt;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class EAU implements EAX {
    public EAL A00;
    public ByteBuffer A01;
    public EAL A02;
    public EAL A03;
    public ByteBuffer A04;
    public boolean A05;
    public EAL A06;

    @Override // X.EAX
    public final void AYz() {
        this.A05 = true;
        if (this instanceof EAI) {
            EAI eai = (EAI) this;
            int i = eai.A01;
            if (i > 0) {
                EAI.A01(eai, eai.A07, i);
            }
            if (eai.A06) {
                return;
            }
            eai.A04 += eai.A02 / eai.A00;
        }
    }

    public final ByteBuffer A02(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = BV8.A17(i);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    @Override // X.EAX
    public final EAL A6n(EAL eal) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        this.A02 = eal;
        if (this instanceof EAI) {
            EAI eai = (EAI) this;
            if (eal.A02 != 2) {
                throw BV6.A0W(eal);
            }
            if (!eai.A05) {
                eal = EAL.A04;
            }
        } else if (this instanceof EAH) {
            int i2 = eal.A02;
            i = 2;
            if (i2 != 3) {
                if (i2 != 2) {
                    if (i2 != 268435456 && i2 != 21 && i2 != 22 && i2 != 4) {
                        throw BV6.A0W(eal);
                    }
                }
                eal = EAL.A04;
            }
            eal = new EAL(eal.A03, eal.A01, i);
        } else {
            if (this instanceof EAJ) {
                int i3 = eal.A02;
                if (i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736) {
                    i = 4;
                    eal = new EAL(eal.A03, eal.A01, i);
                } else if (i3 != 4) {
                    throw BV6.A0W(eal);
                }
            } else {
                int[] iArr = ((EAK) this).A01;
                if (iArr != null) {
                    if (eal.A02 != 2) {
                        throw BV6.A0W(eal);
                    }
                    int i4 = eal.A01;
                    int length = iArr.length;
                    boolean zA1P = AnonymousClass002.A1P(i4, length);
                    for (int i5 = 0; i5 < length; i5++) {
                        int i6 = iArr[i5];
                        if (i6 >= i4) {
                            throw BV6.A0W(eal);
                        }
                        zA1P |= AnonymousClass002.A1P(i6, i5);
                    }
                    if (zA1P) {
                        eal = new EAL(eal.A03, length, 2);
                    }
                }
            }
            eal = EAL.A04;
        }
        this.A03 = eal;
        return !isActive() ? EAL.A04 : eal;
    }

    @Override // X.EAX
    public final ByteBuffer AIL() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = EAX.A00;
        return byteBuffer;
    }

    @Override // X.EAX
    public final void flush() {
        this.A01 = EAX.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (!(this instanceof EAI)) {
            if (this instanceof EAK) {
                EAK eak = (EAK) this;
                eak.A00 = eak.A01;
                return;
            }
            return;
        }
        EAI eai = (EAI) this;
        if (eai.A05) {
            EAL eal = ((EAU) eai).A00;
            int i = eal.A00;
            eai.A00 = i;
            long j = eal.A03;
            int i2 = ((int) ((SessionControllerKt.LIVE_AVATAR_UPDATE_STATUS_TIMEOUT_MS * j) / 1000000)) * i;
            if (eai.A07.length != i2) {
                eai.A07 = new byte[i2];
            }
            int i3 = ((int) ((20000 * j) / 1000000)) * i;
            eai.A02 = i3;
            if (eai.A08.length != i3) {
                eai.A08 = new byte[i3];
            }
        }
        eai.A03 = 0;
        eai.A04 = 0L;
        eai.A01 = 0;
        eai.A06 = false;
    }

    @Override // X.EAX
    public final boolean isActive() {
        return this instanceof EAI ? ((EAI) this).A05 : AnonymousClass006.A1Z(this.A03, EAL.A04);
    }

    @Override // X.EAX
    public final boolean isEnded() {
        return this.A05 && this.A01 == EAX.A00;
    }

    public EAU() {
        ByteBuffer byteBuffer = EAX.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        EAL eal = EAL.A04;
        this.A02 = eal;
        this.A03 = eal;
        this.A00 = eal;
        this.A06 = eal;
    }

    @Override // X.EAX
    public final void reset() {
        flush();
        this.A04 = EAX.A00;
        EAL eal = EAL.A04;
        this.A02 = eal;
        this.A03 = eal;
        this.A00 = eal;
        this.A06 = eal;
        if (!(this instanceof EAI)) {
            if (this instanceof EAK) {
                EAK eak = (EAK) this;
                eak.A00 = null;
                eak.A01 = null;
                return;
            }
            return;
        }
        EAI eai = (EAI) this;
        eai.A05 = false;
        eai.A02 = 0;
        byte[] bArr = Util.A07;
        eai.A07 = bArr;
        eai.A08 = bArr;
    }
}
