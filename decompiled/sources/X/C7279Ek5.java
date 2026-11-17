package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.Ek5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7279Ek5 extends Drawable implements Animatable {
    public static final C7297EkO A0H = new C7297EkO();
    public int A00;
    public long A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public C7283EkA A0A;
    public InterfaceC7278Ek4 A0B;
    public C7286EkD A0C;
    public final Runnable A0D;
    public final C7292EkJ A0E;
    public volatile C7297EkO A0F;
    public volatile boolean A0G;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7286EkD c7286EkD;
        C7384Etj.A0Y(canvas, 0);
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        if (interfaceC7278Ek4 == null || (c7286EkD = this.A0C) == null) {
            return;
        }
        long jUptimeMillis = this.A0G ? SystemClock.uptimeMillis() - this.A01 : (long) Math.max(this.A07, 0.0d);
        int iA00 = c7286EkD.A00(jUptimeMillis);
        if (iA00 == -1) {
            C7384Etj.A0X(interfaceC7278Ek4);
            iA00 = interfaceC7278Ek4.getFrameCount() - 1;
            this.A0G = false;
        }
        C7384Etj.A0X(interfaceC7278Ek4);
        if (interfaceC7278Ek4.A9P(canvas, this, iA00)) {
            this.A03 = iA00;
            this.A02 = 0;
        } else {
            int i = this.A00 + 1;
            this.A00 = i;
            int i2 = this.A02 + 1;
            this.A02 = i2;
            int i3 = this.A04;
            if (i3 > 0 && i2 >= i3) {
                AbstractC3422CMk.A02(C7279Ek5.class, "Animation circuit breaker tripped after %d consecutive dropped frames; stopping animation (frameToDraw=%d, totalDropped=%d)", Integer.valueOf(i2), Integer.valueOf(iA00), Integer.valueOf(i));
                this.A0G = false;
                unscheduleSelf(this.A0D);
                return;
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.A0G) {
            long jA01 = c7286EkD.A01(jUptimeMillis2 - this.A01);
            if (jA01 != -1) {
                scheduleSelf(this.A0D, this.A01 + this.A06 + jA01);
            } else {
                this.A0G = false;
            }
        }
        this.A07 = jUptimeMillis;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        if (interfaceC7278Ek4 != null) {
            interfaceC7278Ek4.Acx(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        return interfaceC7278Ek4 != null ? interfaceC7278Ek4.AGg() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        return interfaceC7278Ek4 != null ? interfaceC7278Ek4.AGh() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A0G;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.A0G) {
            return false;
        }
        long j = i;
        if (this.A07 == j) {
            return false;
        }
        this.A07 = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C7283EkA c7283EkA = this.A0A;
        if (c7283EkA == null) {
            c7283EkA = new C7283EkA();
            this.A0A = c7283EkA;
        }
        c7283EkA.A00 = i;
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        if (interfaceC7278Ek4 != null) {
            interfaceC7278Ek4.Ack(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C7283EkA c7283EkA = this.A0A;
        if (c7283EkA == null) {
            c7283EkA = new C7283EkA();
            this.A0A = c7283EkA;
        }
        c7283EkA.A03 = colorFilter;
        c7283EkA.A04 = AnonymousClass002.A1X(colorFilter);
        InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
        if (interfaceC7278Ek4 != null) {
            interfaceC7278Ek4.Ad5(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        InterfaceC7278Ek4 interfaceC7278Ek4;
        if (this.A0G || (interfaceC7278Ek4 = this.A0B) == null || interfaceC7278Ek4.getFrameCount() <= 1) {
            return;
        }
        this.A0G = true;
        this.A02 = 0;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.A01 = jUptimeMillis - this.A09;
        this.A07 = jUptimeMillis - this.A08;
        this.A03 = this.A05;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.A0G) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.A09 = jUptimeMillis - this.A01;
            this.A08 = jUptimeMillis - this.A07;
            this.A05 = this.A03;
            this.A0G = false;
            this.A01 = 0L;
            this.A07 = -1L;
            this.A03 = -1;
            InterfaceC7278Ek4 interfaceC7278Ek4 = this.A0B;
            if (interfaceC7278Ek4 != null) {
                interfaceC7278Ek4.clear();
            }
            unscheduleSelf(this.A0D);
        }
    }

    public C7279Ek5(InterfaceC7278Ek4 interfaceC7278Ek4) {
        this.A0B = interfaceC7278Ek4;
        this.A06 = 8L;
        this.A04 = 150;
        this.A0F = A0H;
        C7292EkJ c7292EkJ = new C7292EkJ(this);
        this.A0E = c7292EkJ;
        this.A0D = new RunnableC7289EkG(this);
        InterfaceC7278Ek4 interfaceC7278Ek42 = this.A0B;
        this.A0C = interfaceC7278Ek42 == null ? null : new C7286EkD(interfaceC7278Ek42);
        InterfaceC7278Ek4 interfaceC7278Ek43 = this.A0B;
        if (interfaceC7278Ek43 != null) {
            interfaceC7278Ek43.Acm(c7292EkJ);
        }
    }

    public C7279Ek5() {
        this(null);
    }
}
