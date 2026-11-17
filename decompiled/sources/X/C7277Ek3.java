package X;

import X.InterfaceC7278Ek4;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.Ek3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7277Ek3<T extends InterfaceC7278Ek4> implements InterfaceC7278Ek4 {
    public long A00;
    public T A01;
    public C7269Eju A02;
    public ColorFilter A04;
    public Rect A05;
    public final DK9 A06;
    public final ScheduledExecutorService A08;
    public boolean A03 = false;
    public final Runnable A07 = new RunnableC7276Ek2(this);

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r5v0 X.Ek3) */
    public static synchronized void A00(C7277Ek3 c7277Ek3) {
        synchronized (c7277Ek3) {
            if (!c7277Ek3.A03) {
                c7277Ek3.A03 = true;
                c7277Ek3.A08.schedule(c7277Ek3.A07, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // X.InterfaceC7278Ek4
    public final void Acx(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        this.A01.Acx(rect);
        this.A05 = rect;
    }

    @Override // X.InterfaceC7278Ek4
    public final boolean A9P(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean zA1Y = C60P.A1Y(drawable, canvas);
        boolean zA9P = this.A01.A9P(canvas, drawable, i);
        boolean zA1Q = AnonymousClass002.A1Q(zA9P ? 1 : 0, zA1Y ? 1 : 0);
        A00(this);
        return zA1Q;
    }

    @Override // X.InterfaceC7288EkF
    public final int AFs(int i) {
        return this.A01.AFs(i);
    }

    @Override // X.InterfaceC7278Ek4
    public final int AGg() {
        return this.A01.AGg();
    }

    @Override // X.InterfaceC7278Ek4
    public final int AGh() {
        return this.A01.AGh();
    }

    @Override // X.InterfaceC7288EkF
    public final int AHK() {
        return this.A01.AHK();
    }

    @Override // X.InterfaceC7288EkF
    public final int ANN() {
        return this.A01.ANN();
    }

    @Override // X.InterfaceC7278Ek4
    public final void Ack(int i) {
        this.A01.Ack(i);
    }

    @Override // X.InterfaceC7278Ek4
    public final void Acm(C7292EkJ c7292EkJ) {
        this.A01.Acm(c7292EkJ);
    }

    @Override // X.InterfaceC7278Ek4
    public final void Ad5(ColorFilter colorFilter) {
        this.A01.Ad5(colorFilter);
        this.A04 = colorFilter;
    }

    @Override // X.InterfaceC7288EkF
    public final int AiQ() {
        return this.A01.AiQ();
    }

    @Override // X.InterfaceC7278Ek4
    public final void clear() {
        this.A01.clear();
    }

    @Override // X.InterfaceC7288EkF
    public final int getFrameCount() {
        return this.A01.getFrameCount();
    }

    @Override // X.InterfaceC7288EkF
    public final int getLoopCount() {
        return this.A01.getLoopCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7277Ek3(DK9 dk9, InterfaceC7278Ek4 interfaceC7278Ek4, C7269Eju c7269Eju, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = interfaceC7278Ek4;
        this.A02 = c7269Eju;
        this.A06 = dk9;
        this.A08 = scheduledExecutorService;
    }
}
