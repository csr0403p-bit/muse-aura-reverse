package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.Ek6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7280Ek6 extends Drawable implements Animatable {
    public InterfaceC7278Ek4 A00;
    public final C7283EkA A01;
    public final C7284EkB A02;
    public final RunnableC7290EkH A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        C7284EkB c7284EkB = this.A02;
        long jUptimeMillis = c7284EkB.A06 ? SystemClock.uptimeMillis() - c7284EkB.A05 : Math.max(c7284EkB.A03, 0L);
        C7286EkD c7286EkD = c7284EkB.A07;
        int iA00 = c7286EkD.A00(jUptimeMillis);
        c7284EkB.A03 = jUptimeMillis;
        if (iA00 == -1) {
            iA00 = this.A00.getFrameCount() - 1;
            c7284EkB.A06 = false;
        } else if (iA00 == 0 && c7284EkB.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.A9P(canvas, this, iA00)) {
            c7284EkB.A01 = iA00;
        } else {
            c7284EkB.A00++;
        }
        if (c7284EkB.A06) {
            long jA01 = c7286EkD.A01(SystemClock.uptimeMillis() - c7284EkB.A05);
            if (jA01 != -1) {
                long j = jA01 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                c7284EkB.A06 = false;
            }
        }
        c7284EkB.A06 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        this.A00.Acx(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.AGg();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.AGh();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A02.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.A00 = i;
        this.A00.Ack(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C7283EkA c7283EkA = this.A01;
        c7283EkA.A03 = colorFilter;
        c7283EkA.A04 = AnonymousClass002.A1X(colorFilter);
        this.A00.Ad5(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.A00.getFrameCount() > 0) {
            C7284EkB c7284EkB = this.A02;
            if (!c7284EkB.A06) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                c7284EkB.A05 = jUptimeMillis - c7284EkB.A04;
                c7284EkB.A03 = jUptimeMillis - c7284EkB.A02;
                c7284EkB.A01 = -1;
                c7284EkB.A06 = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        C7284EkB c7284EkB = this.A02;
        if (c7284EkB.A06) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            c7284EkB.A04 = jUptimeMillis - c7284EkB.A05;
            c7284EkB.A02 = jUptimeMillis - c7284EkB.A03;
            c7284EkB.A05 = 0L;
            c7284EkB.A03 = -1L;
            c7284EkB.A01 = -1;
            c7284EkB.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public C7280Ek6(InterfaceC7278Ek4 interfaceC7278Ek4) {
        this.A00 = interfaceC7278Ek4;
        this.A02 = new C7284EkB(new C7286EkD(interfaceC7278Ek4));
        C7283EkA c7283EkA = new C7283EkA();
        c7283EkA.A00(this);
        this.A01 = c7283EkA;
        this.A03 = new RunnableC7290EkH(this);
    }
}
