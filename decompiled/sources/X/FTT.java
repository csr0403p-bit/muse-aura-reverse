package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FTT implements Runnable {
    public static final String __redex_internal_original_name = "RecyclerView$ViewFlinger";
    public Interpolator A00;
    public OverScroller A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public final /* synthetic */ RecyclerView A06;

    public final void A02(Interpolator interpolator, int i, int i2, int i3) {
        int height;
        int iMin = i3;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean zA1V = C8j4.A1V(iAbs, iAbs2);
            RecyclerView recyclerView = this.A06;
            if (zA1V) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                iAbs = iAbs2;
            }
            iMin = Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.A1K;
        }
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A03 = 0;
        this.A02 = 0;
        this.A06.setScrollState(2);
        this.A01.startScroll(0, 0, i, i2, iMin);
        A00();
    }

    public FTT(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1K;
        this.A00 = interpolator;
        this.A04 = false;
        this.A05 = false;
        this.A01 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        recyclerView.postOnAnimation(this);
    }

    public final void A01(int i, int i2) {
        RecyclerView recyclerView = this.A06;
        recyclerView.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        Interpolator interpolator = this.A00;
        Interpolator interpolator2 = RecyclerView.A1K;
        if (interpolator != interpolator2) {
            this.A00 = interpolator2;
            this.A01 = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A00();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        RecyclerView recyclerView = this.A06;
        if (recyclerView.A0H == null) {
            recyclerView.removeCallbacks(this);
            this.A01.abortAnimation();
            return;
        }
        this.A05 = false;
        this.A04 = true;
        recyclerView.A0k();
        OverScroller overScroller = this.A01;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.A02;
            int i5 = currY - this.A03;
            this.A02 = currX;
            this.A03 = currY;
            int iA06 = RecyclerView.A06(recyclerView.A07, recyclerView.A08, i4, recyclerView.getWidth());
            int iA062 = RecyclerView.A06(recyclerView.A09, recyclerView.A06, i5, recyclerView.getHeight());
            int[] iArr = recyclerView.A1D;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.A18(iArr, null, iA06, iA062, 1)) {
                iA06 -= iArr[0];
                iA062 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.A0r(iA06, iA062);
            }
            if (recyclerView.A0F != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.A15(iArr, iA06, iA062);
                i = iArr[0];
                i2 = iArr[1];
                iA06 -= i;
                iA062 -= i2;
                AbstractC8094FTa abstractC8094FTa = recyclerView.A0H.A06;
                if (abstractC8094FTa != null && !abstractC8094FTa.A04 && abstractC8094FTa.A05) {
                    int iA00 = recyclerView.A13.A00();
                    if (iA00 == 0) {
                        abstractC8094FTa.A00();
                    } else {
                        if (abstractC8094FTa.A00 >= iA00) {
                            abstractC8094FTa.A00 = iA00 - 1;
                        }
                        abstractC8094FTa.A02(i, i2);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!recyclerView.A18.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            recyclerView.A16(null, iArr, i, i2, iA06, iA062, 1);
            int i6 = iA06 - iArr[0];
            int i7 = iA062 - iArr[1];
            if (i != 0 || i2 != 0) {
                recyclerView.A0t(i, i2);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || ((AnonymousClass002.A1Q(overScroller.getCurrX(), overScroller.getFinalX()) || i6 != 0) && (AnonymousClass002.A1Q(overScroller.getCurrY(), overScroller.getFinalY()) || i7 != 0));
            AbstractC8094FTa abstractC8094FTa2 = recyclerView.A0H.A06;
            if ((abstractC8094FTa2 == null || !abstractC8094FTa2.A04) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = 0;
                        if (i6 > 0) {
                            i3 = currVelocity;
                        }
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i3 < 0) {
                        RecyclerView.A0S(recyclerView);
                        if (recyclerView.A07.isFinished()) {
                            recyclerView.A07.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        RecyclerView.A0T(recyclerView);
                        if (recyclerView.A08.isFinished()) {
                            recyclerView.A08.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        RecyclerView.A0U(recyclerView);
                        if (recyclerView.A09.isFinished()) {
                            recyclerView.A09.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        RecyclerView.A0R(recyclerView);
                        if (recyclerView.A06.isFinished()) {
                            recyclerView.A06.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C8095FTb c8095FTb = recyclerView.A0D;
                int[] iArr2 = c8095FTb.A03;
                if (iArr2 != null) {
                    Arrays.fill(iArr2, -1);
                }
                c8095FTb.A00 = 0;
            } else {
                A00();
                FTU ftu = recyclerView.A0E;
                if (ftu != null) {
                    ftu.A01(recyclerView, i, i2);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                FUB.A00(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        AbstractC8094FTa abstractC8094FTa3 = recyclerView.A0H.A06;
        if (abstractC8094FTa3 != null && abstractC8094FTa3.A04) {
            abstractC8094FTa3.A02(0, 0);
        }
        this.A04 = false;
        if (this.A05) {
            recyclerView.removeCallbacks(this);
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.A0q(1);
        }
    }
}
