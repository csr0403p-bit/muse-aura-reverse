package X;

import X.AbstractC6252Dyv;
import X.Di2;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;

/* renamed from: X.Dxb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6191Dxb<I extends Di2, O extends AbstractC6252Dyv, E extends DecoderException> implements InterfaceC6223DyE<I, O, E> {
    public int A00;
    public int A01;
    public E A03;
    public I A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public final I[] A0A;
    public final O[] A0B;
    public final Thread A0C;
    public final Object A08 = C3cG.A0T();
    public long A02 = -9223372036854775807L;
    public final ArrayDeque<I> A09 = BV4.A0s();
    public final ArrayDeque<O> A0D = BV4.A0s();

    public static boolean A00(AbstractC6191Dxb abstractC6191Dxb) throws IllegalAccessException, IOException, IllegalArgumentException, ImageDecoderException, InvocationTargetException {
        boolean z;
        E e;
        int i;
        E0T e0tAXf;
        int i2;
        Object obj = abstractC6191Dxb.A08;
        synchronized (obj) {
            while (!abstractC6191Dxb.A07 && (abstractC6191Dxb.A09.isEmpty() || abstractC6191Dxb.A01 <= 0)) {
                obj.wait();
            }
            if (abstractC6191Dxb.A07) {
                return false;
            }
            I iRemoveFirst = abstractC6191Dxb.A09.removeFirst();
            O[] oArr = abstractC6191Dxb.A0B;
            int i3 = abstractC6191Dxb.A01 - 1;
            abstractC6191Dxb.A01 = i3;
            O o = oArr[i3];
            boolean z2 = abstractC6191Dxb.A06;
            abstractC6191Dxb.A06 = false;
            if (AbstractC5364DhG.A00(iRemoveFirst)) {
                o.A00 |= 4;
            } else {
                long j = iRemoveFirst.A00;
                o.A00 = j;
                if (AnonymousClass002.A1Q(iRemoveFirst.A00 & 134217728, 134217728)) {
                    o.A00 = 134217728 | o.A00;
                }
                synchronized (obj) {
                    long j2 = abstractC6191Dxb.A02;
                    if (j2 != -9223372036854775807L) {
                        z = false;
                        if (j >= j2) {
                        }
                    }
                    z = true;
                }
                if (!z) {
                    o.A01 = true;
                }
                try {
                    try {
                        if (abstractC6191Dxb instanceof E04) {
                            E04 e04 = (E04) abstractC6191Dxb;
                            E0B e0b = (E0B) iRemoveFirst;
                            E0M e0m = (E0M) o;
                            ByteBuffer byteBuffer = e0b.A01;
                            byteBuffer.getClass();
                            byte[] bArrArray = byteBuffer.array();
                            int iLimit = byteBuffer.limit();
                            if (e04 instanceof E0c) {
                                E0c e0c = (E0c) e04;
                                ArrayList arrayListA0h = C3cG.A0h();
                                C6316E0o c6316E0o = new C6316E0o();
                                E1P e1p = new E1P();
                                e1p.A02 = bArrArray;
                                e1p.A00 = iLimit;
                                while (true) {
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strA0L = e1p.A0L(charset);
                                    if (strA0L == null) {
                                        break;
                                    }
                                    if (strA0L.length() != 0) {
                                        try {
                                            Integer.parseInt(strA0L);
                                            String strA0L2 = e1p.A0L(charset);
                                            if (strA0L2 == null) {
                                                AbstractC3426CMt.A04("HeroPlayer2SubripDecoder", "Unexpected end", new Object[0]);
                                                break;
                                            }
                                            Matcher matcher = E0c.A01.matcher(strA0L2);
                                            if (matcher.matches()) {
                                                boolean z3 = true;
                                                c6316E0o.A01(E0c.A01(matcher, 1));
                                                if (TextUtils.isEmpty(matcher.group(6))) {
                                                    z3 = false;
                                                } else {
                                                    c6316E0o.A01(E0c.A01(matcher, 6));
                                                }
                                                StringBuilder sb = e0c.A00;
                                                sb.setLength(0);
                                                while (true) {
                                                    String strA0L3 = e1p.A0L(charset);
                                                    if (TextUtils.isEmpty(strA0L3)) {
                                                        break;
                                                    }
                                                    if (sb.length() > 0) {
                                                        sb.append("<br>");
                                                    }
                                                    sb.append(strA0L3.trim());
                                                }
                                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                                E0L e0l = new E0L();
                                                e0l.A0G = spannedFromHtml;
                                                e0l.A0D = null;
                                                arrayListA0h.add(e0l.A00());
                                                if (z3) {
                                                    arrayListA0h.add(null);
                                                }
                                            } else {
                                                AbstractC3426CMt.A04("HeroPlayer2SubripDecoder", FGI.A0M("Skipping invalid timing: ", strA0L2), new Object[0]);
                                            }
                                        } catch (NumberFormatException unused) {
                                            AbstractC3426CMt.A04("HeroPlayer2SubripDecoder", FGI.A0M("Skipping invalid index: ", strA0L), new Object[0]);
                                        }
                                    }
                                }
                                int size = arrayListA0h.size();
                                E0J[] e0jArr = new E0J[size];
                                arrayListA0h.toArray(e0jArr);
                                long[] jArrCopyOf = Arrays.copyOf(c6316E0o.A01, c6316E0o.A00);
                                ArrayList arrayListA0h2 = C3cG.A0h();
                                for (int i4 = 0; i4 < size; i4++) {
                                    arrayListA0h2.add(new C6307E0f(e0jArr[i4], jArrCopyOf[i4]));
                                }
                                Collections.sort(arrayListA0h2);
                                for (i2 = 0; i2 < size; i2++) {
                                    C6307E0f c6307E0f = (C6307E0f) arrayListA0h2.get(i2);
                                    e0jArr[i2] = c6307E0f.A01;
                                    jArrCopyOf[i2] = c6307E0f.A00;
                                }
                                e0tAXf = new C6306E0d(jArrCopyOf, e0jArr);
                            } else if (e04 instanceof E0Z) {
                                E0Z e0z = (E0Z) e04;
                                if (z2) {
                                    e0z.A00.reset();
                                }
                                e0tAXf = e0z.A00.AXf(bArrArray, 0, iLimit);
                                e0tAXf.getClass();
                            } else {
                                C6308E0g c6308E0g = (C6308E0g) e04;
                                if (z2) {
                                    c6308E0g.A00.reset();
                                }
                                e0tAXf = c6308E0g.A00.AXf(bArrArray, 0, iLimit);
                            }
                            long j3 = ((Di2) e0b).A00;
                            long j4 = e0b.A00;
                            ((AbstractC6252Dyv) e0m).A00 = j3;
                            e0m.A01 = e0tAXf;
                            if (j4 == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                                j4 = j3;
                            }
                            e0m.A00 = j4;
                            ((AbstractC6252Dyv) e0m).A01 = false;
                        } else {
                            C6221DyC c6221DyC = (C6221DyC) o;
                            ByteBuffer byteBuffer2 = iRemoveFirst.A01;
                            byteBuffer2.getClass();
                            C1G.A08(byteBuffer2.hasArray());
                            C1G.A07(AnonymousClass002.A1M(byteBuffer2.arrayOffset()));
                            byte[] bArrArray2 = byteBuffer2.array();
                            int iRemaining = byteBuffer2.remaining();
                            try {
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrArray2, 0, iRemaining, null);
                                if (bitmapDecodeByteArray == null) {
                                    throw BV6.A0V("Could not decode image data", BV4.A0T());
                                }
                                ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(bArrArray2);
                                try {
                                    BqQ bqQ = new BqQ(byteArrayInputStreamA0E);
                                    byteArrayInputStreamA0E.close();
                                    switch (bqQ.A0b("Orientation", 1)) {
                                        case 3:
                                        case 4:
                                            i = 180;
                                            Matrix matrixA08 = BV4.A08();
                                            matrixA08.postRotate(i);
                                            bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrixA08, false);
                                            break;
                                        case 5:
                                        case 8:
                                            i = 270;
                                            Matrix matrixA082 = BV4.A08();
                                            matrixA082.postRotate(i);
                                            bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrixA082, false);
                                            break;
                                        case 6:
                                        case 7:
                                            i = 90;
                                            Matrix matrixA0822 = BV4.A08();
                                            matrixA0822.postRotate(i);
                                            bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrixA0822, false);
                                            break;
                                    }
                                    c6221DyC.A00 = bitmapDecodeByteArray;
                                    ((AbstractC6252Dyv) c6221DyC).A00 = iRemoveFirst.A00;
                                } catch (Throwable th) {
                                    try {
                                        byteArrayInputStreamA0E.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    }
                                }
                            } catch (ParserException e2) {
                                throw new ImageDecoderException(FGI.A0Y("Could not decode image data with BitmapFactory. (data.length = ", ", input length = ", ")", bArrArray2.length, iRemaining), e2);
                            } catch (IOException e3) {
                                throw new ImageDecoderException(e3);
                            }
                        }
                    } catch (ImageDecoderException | SubtitleDecoderException e4) {
                        e = e4;
                        synchronized (obj) {
                            abstractC6191Dxb.A03 = e;
                        }
                        return false;
                    }
                } catch (OutOfMemoryError | RuntimeException e5) {
                    e = abstractC6191Dxb instanceof E04 ? new SubtitleDecoderException("Unexpected decode error", e5) : new ImageDecoderException("Unexpected decode error", e5);
                }
            }
            synchronized (obj) {
                if (abstractC6191Dxb.A06) {
                    o.A03();
                    iRemoveFirst.A02();
                    I[] iArr = abstractC6191Dxb.A0A;
                    int i5 = abstractC6191Dxb.A00;
                    abstractC6191Dxb.A00 = i5 + 1;
                    iArr[i5] = iRemoveFirst;
                } else {
                    boolean z4 = o.A01;
                    int i6 = abstractC6191Dxb.A05;
                    if (z4) {
                        abstractC6191Dxb.A05 = i6 + 1;
                        o.A03();
                        iRemoveFirst.A02();
                        I[] iArr2 = abstractC6191Dxb.A0A;
                        int i52 = abstractC6191Dxb.A00;
                        abstractC6191Dxb.A00 = i52 + 1;
                        iArr2[i52] = iRemoveFirst;
                    } else {
                        abstractC6191Dxb.A05 = 0;
                        abstractC6191Dxb.A0D.addLast(o);
                        iRemoveFirst.A02();
                        I[] iArr22 = abstractC6191Dxb.A0A;
                        int i522 = abstractC6191Dxb.A00;
                        abstractC6191Dxb.A00 = i522 + 1;
                        iArr22[i522] = iRemoveFirst;
                    }
                }
            }
            return true;
        }
    }

    @Override // X.InterfaceC6223DyE
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final O A8s() {
        O oRemoveFirst;
        synchronized (this.A08) {
            E e = this.A03;
            if (e != null) {
                throw e;
            }
            ArrayDeque<O> arrayDeque = this.A0D;
            oRemoveFirst = arrayDeque.isEmpty() ? null : arrayDeque.removeFirst();
        }
        return oRemoveFirst;
    }

    @Override // X.InterfaceC6223DyE
    public final /* bridge */ /* synthetic */ Object A8q() {
        I i;
        synchronized (this.A08) {
            E e = this.A03;
            if (e != null) {
                throw e;
            }
            C1G.A08(AnonymousClass002.A1Y(this.A04));
            int i2 = this.A00;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0A;
                int i3 = i2 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A04 = i;
        }
        return i;
    }

    @Override // X.InterfaceC6223DyE
    /* renamed from: AZ1, reason: merged with bridge method [inline-methods] */
    public final void AZ2(I i) {
        Object obj = this.A08;
        synchronized (obj) {
            E e = this.A03;
            if (e != null) {
                throw e;
            }
            C1G.A07(AnonymousClass002.A1Z(i, this.A04));
            ArrayDeque<I> arrayDeque = this.A09;
            arrayDeque.addLast(i);
            if (!arrayDeque.isEmpty() && this.A01 > 0) {
                obj.notify();
            }
            this.A04 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // X.InterfaceC6223DyE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Adx(long r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A08
            monitor-enter(r2)
            int r1 = r3.A00     // Catch: java.lang.Throwable -> L17
            I extends X.Di2[] r0 = r3.A0A     // Catch: java.lang.Throwable -> L17
            int r0 = r0.length     // Catch: java.lang.Throwable -> L17
            if (r1 == r0) goto Lf
            boolean r1 = r3.A06     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            X.C1G.A08(r0)     // Catch: java.lang.Throwable -> L17
            r3.A02 = r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6191Dxb.Adx(long):void");
    }

    @Override // X.InterfaceC6223DyE
    public final void flush() {
        synchronized (this.A08) {
            this.A06 = true;
            this.A05 = 0;
            I i = this.A04;
            if (i != null) {
                i.A02();
                I[] iArr = this.A0A;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                iArr[i2] = i;
                this.A04 = null;
            }
            while (true) {
                ArrayDeque<I> arrayDeque = this.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                I iRemoveFirst = arrayDeque.removeFirst();
                iRemoveFirst.A02();
                I[] iArr2 = this.A0A;
                int i3 = this.A00;
                this.A00 = i3 + 1;
                iArr2[i3] = iRemoveFirst;
            }
            while (true) {
                ArrayDeque<O> arrayDeque2 = this.A0D;
                if (!arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst().A03();
                }
            }
        }
    }

    @Override // X.InterfaceC6223DyE
    public final void release() throws InterruptedException {
        Object obj = this.A08;
        synchronized (obj) {
            this.A07 = true;
            obj.notify();
        }
        try {
            this.A0C.join();
        } catch (InterruptedException unused) {
            BV4.A1A();
        }
    }

    public AbstractC6191Dxb(I[] iArr, O[] oArr) {
        this.A0A = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            ((I[]) this.A0A)[i] = this instanceof E04 ? new E0B(1) : new Di2(1);
        }
        this.A0B = oArr;
        int length = oArr.length;
        this.A01 = length;
        for (int i2 = 0; i2 < length; i2++) {
            oArr[i2] = this instanceof E04 ? new E08((E04) this) : new C6221DyC((C6164Dx7) this);
        }
        C6212Dxy c6212Dxy = new C6212Dxy(this);
        this.A0C = c6212Dxy;
        c6212Dxy.start();
    }
}
