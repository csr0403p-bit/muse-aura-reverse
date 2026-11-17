package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aou, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1711Aou extends AbstractC1718Ap2 {
    public static final G0U<C1711Aou, Unit> A0K = new BUU(19);
    public EnumC1820Arj A00;
    public AeE A01;
    public C11N A02;
    public Object A03;
    public String A04;
    public Function0<Unit> A05;
    public BLU A06;
    public boolean A07;
    public final Rect A08;
    public final View A09;
    public final WindowManager.LayoutParams A0A;
    public final WindowManager A0B;
    public final MutableState A0C;
    public final MutableState A0D;
    public final MutableState A0E;
    public final C1BO A0F;
    public final BBO A0G;
    public final InterfaceC1713Aow A0H;
    public final boolean A0I;
    public final int[] A0J;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || ((motionEvent.getAction() != 0 || (motionEvent.getX() >= 0.0f && motionEvent.getX() < getWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() < getHeight())) && motionEvent.getAction() != 4)) {
            return super.onTouchEvent(motionEvent);
        }
        Function0<Unit> function0 = this.A05;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1711Aou(View view, AXN axn, AeE aeE, C11N c11n, String str, UUID uuid, Function0 function0, boolean z) {
        InterfaceC1713Aow c1739Apc = Build.VERSION.SDK_INT >= 30 ? new C1739Apc() : new C1716Aoz();
        Context context = view.getContext();
        super(context);
        this.A05 = function0;
        this.A02 = c11n;
        this.A04 = str;
        this.A09 = view;
        this.A0I = z;
        this.A0H = c1739Apc;
        Object systemService = context.getSystemService("window");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.A0B = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C11N c11n2 = this.A02;
        View view2 = this.A09;
        layoutParams.flags = AYW.A02(view2) ? c11n2.A00 | 8192 : c11n2.A00 & (-8193);
        layoutParams.type = 1002;
        layoutParams.token = view2.getApplicationWindowToken();
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view2.getContext().getResources().getString(R.string._name_removed__res_0x7f1208d1));
        this.A0A = layoutParams;
        this.A01 = aeE;
        this.A00 = EnumC1820Arj.A02;
        AGE age = AGE.A00;
        this.A0E = C3cG.A08(age, null);
        this.A0D = C3cG.A08(age, null);
        this.A0F = AbstractC1798ArH.A02(this, 43);
        this.A08 = new Rect();
        this.A0G = new BBO(new C2326BUa(this, 15));
        setId(android.R.id.content);
        Ap6.A01(view, this);
        setTag(R.id.compose_view_saveable_id_tag, AnonymousClass007.A0a("Popup:", uuid));
        setClipChildren(false);
        setElevation(axn.Ah4(8.0f));
        setOutlineProvider(new BSA(3));
        this.A0C = C3cG.A08(age, C8kD.A00);
        this.A0J = new int[2];
    }

    private final G0V<BFM, Integer, Unit> getContent() {
        return (G0V) this.A0C.getValue();
    }

    private final BLU getDisplayBounds() {
        Rect rect = this.A08;
        boolean zA1M = AnonymousClass002.A1M(this.A02.A00 & 512);
        InterfaceC1713Aow interfaceC1713Aow = this.A0H;
        View view = this.A09;
        if (zA1M) {
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            interfaceC1713Aow.AMn(view, rect);
        }
        return new BLU(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1497Ak4 getParentLayoutCoordinates() {
        return (InterfaceC1497Ak4) this.A0D.getValue();
    }

    private final void setContent(G0V<? super BFM, ? super Integer, Unit> g0v) {
        this.A0C.Af8(g0v);
    }

    private final void setParentLayoutCoordinates(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A0D.Af8(interfaceC1497Ak4);
    }

    public final void A0G() {
        BL4 bl4M16getPopupContentSizebOM6tXw;
        BLU blu = this.A06;
        if (blu == null || (bl4M16getPopupContentSizebOM6tXw = m16getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = bl4M16getPopupContentSizebOM6tXw.A00;
        BLU displayBounds = getDisplayBounds();
        long j2 = ((displayBounds.A02 - displayBounds.A01) << 32) | ((displayBounds.A00 - displayBounds.A03) & 4294967295L);
        BO7 bo7 = new BO7();
        bo7.element = 0L;
        this.A0G.A03(this, new C1225Af3(blu, this, bo7, j2, j), A0K);
        WindowManager.LayoutParams layoutParams = this.A0A;
        long j3 = bo7.element;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = AnonymousClass002.A09(j3);
        setSystemGestureExclusionRects(AbstractC0885AGm.A0y(new Rect(0, 0, (int) (j2 >> 32), (int) (j2 & 4294967295L))));
        this.A0B.updateViewLayout(this, layoutParams);
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/11N;Ljava/lang/String;LX/Arj;)V */
    public final void A0I(EnumC1820Arj enumC1820Arj, C11N c11n, String str, Function0 function0) {
        this.A05 = function0;
        this.A04 = str;
        if (!C7384Etj.areEqual(this.A02, c11n)) {
            this.A02 = c11n;
            WindowManager.LayoutParams layoutParams = this.A0A;
            layoutParams.flags = AYW.A02(this.A09) ? c11n.A00 | 8192 : c11n.A00 & (-8193);
            this.A0B.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC1820Arj.ordinal();
        int i = 1;
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        super.setLayoutDirection(i);
    }

    public final boolean getCanCalculatePosition() {
        return C1BO.A0F(this.A0F);
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.A0A;
    }

    public final EnumC1820Arj getParentLayoutDirection() {
        return this.A00;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final BL4 m16getPopupContentSizebOM6tXw() {
        return (BL4) this.A0E.getValue();
    }

    public final AeE getPositionProvider() {
        return this.A01;
    }

    @Override // X.AbstractC1718Ap2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A07;
    }

    public AbstractC1718Ap2 getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.A04;
    }

    public /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m17setPopupContentSizefhxjrPA(BL4 bl4) {
        this.A0E.Af8(bl4);
    }

    public static final void A01(C1711Aou c1711Aou) {
        InterfaceC1497Ak4 parentLayoutCoordinates = c1711Aou.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
            return;
        }
        long jAKd = parentLayoutCoordinates.AKd();
        long jAPq = c1711Aou.A0I ? parentLayoutCoordinates.APq(0L) : parentLayoutCoordinates.APr(0L);
        BLU bluA01 = C2Un.A01((Math.round(AnonymousClass001.A00(jAPq)) << 32) | (4294967295L & Math.round(AnonymousClass001.A01(jAPq, 4294967295L))), jAKd);
        if (bluA01.equals(c1711Aou.A06)) {
            return;
        }
        c1711Aou.A06 = bluA01;
        c1711Aou.A0G();
    }

    @Override // X.AbstractC1718Ap2
    public final void A0D(int i, int i2) {
        BLU displayBounds = getDisplayBounds();
        super.A0D(View.MeasureSpec.makeMeasureSpec(displayBounds.A02 - displayBounds.A01, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.A00 - displayBounds.A03, Integer.MIN_VALUE));
    }

    @Override // X.AbstractC1718Ap2
    public final void A0E(BFM bfm, int i) {
        bfm.AgG(-857613600);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, this) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AnonymousClass001.A1H(bfm, getContent(), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(this, i, 4);
        }
    }

    @Override // X.AbstractC1718Ap2
    public final void A0F(boolean z, int i, int i2, int i3, int i4) {
        super.A0F(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            WindowManager.LayoutParams layoutParams = this.A0A;
            ((ViewGroup.LayoutParams) layoutParams).width = childAt.getMeasuredWidth();
            ((ViewGroup.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
            this.A0B.updateViewLayout(this, layoutParams);
        }
    }

    public final void A0H(InterfaceC1497Ak4 interfaceC1497Ak4) {
        setParentLayoutCoordinates(interfaceC1497Ak4);
        A01(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.A05;
                if (function0 != null) {
                    function0.invoke();
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.AbstractC1718Ap2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BBO bbo = this.A0G;
        bbo.A00 = Snapshot.A01(bbo.A09);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objA00 = this.A03;
            if (objA00 == null) {
                objA00 = AbstractC2189B9u.A00(this.A05);
                this.A03 = objA00;
            }
            AbstractC2189B9u.A01(this, objA00);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BBO bbo = this.A0G;
        AOY aoy = bbo.A00;
        if (aoy != null) {
            aoy.dispose();
        }
        bbo.A01();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2189B9u.A02(this, this.A03);
        }
        this.A03 = null;
    }

    public final void setParentLayoutDirection(EnumC1820Arj enumC1820Arj) {
        this.A00 = enumC1820Arj;
    }

    public final void setPositionProvider(AeE aeE) {
        this.A01 = aeE;
    }

    public final void setTestTag(String str) {
        this.A04 = str;
    }

    public final void setContent(BBV bbv, G0V<? super BFM, ? super Integer, Unit> g0v) {
        setParentCompositionContext(bbv);
        setContent(g0v);
        this.A07 = true;
    }
}
