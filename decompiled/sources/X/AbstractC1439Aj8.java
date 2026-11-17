package X;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aj8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1439Aj8 implements C1Z3 {
    public static final int $stable = 8;
    public AbstractC1439Aj8 child;
    public AbstractC1387AiH coordinator;
    public Function0<Unit> detachedListener;
    public boolean insertedNodeAwaitingAttachForInvalidation;
    public boolean isAttached;
    public int kindSet;
    public boolean onAttachRunExpected;
    public boolean onDetachRunExpected;
    public C1446AjF ownerScope;
    public AbstractC1439Aj8 parent;
    public C3UX scope;
    public boolean updatedNodeAwaitingAttachForInvalidation;
    public AbstractC1439Aj8 node = this;
    public int aggregateChildKindSet = -1;

    public static C1983Avo A0G() {
        C1983Avo c1983Avo = new C1983Avo();
        c1983Avo.A00 = 0.0f;
        c1983Avo.A02 = true;
        c1983Avo.A01 = null;
        return c1983Avo;
    }

    public static void A0H(C1948Aum c1948Aum, C1945Auj c1945Auj, C1822Arm c1822Arm, String str) {
        C2K7 c2k7 = c1945Auj.A07;
        int i = c1945Auj.A02;
        boolean z = c1945Auj.A0A;
        int i2 = c1945Auj.A00;
        int i3 = c1945Auj.A01;
        c1948Aum.A0D = str;
        c1948Aum.A09 = c1822Arm;
        c1948Aum.A0A = c2k7;
        c1948Aum.A02 = i;
        c1948Aum.A0F = z;
        c1948Aum.A00 = i2;
        c1948Aum.A01 = i3;
        c1948Aum.A03 = 2 | (c1948Aum.A03 << 2);
        C1948Aum.A02(c1948Aum);
    }

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public final int getAggregateChildKindSet$ui() {
        return this.aggregateChildKindSet;
    }

    public final AbstractC1439Aj8 getChild$ui() {
        return this.child;
    }

    public final AbstractC1387AiH getCoordinator$ui() {
        return this.coordinator;
    }

    public final C3UX getCoroutineScope() {
        C3UX c3ux = this.scope;
        if (c3ux != null) {
            return c3ux;
        }
        HzC hzCA02 = Hxb.A02(((AndroidComposeView) AbstractC1414Aij.A07(this)).A0A.plus(new C9250GBd((HoC) ((AndroidComposeView) AbstractC1414Aij.A07(this)).A0A.get(HoC.A00))));
        this.scope = hzCA02;
        return hzCA02;
    }

    public final Function0<Unit> getDetachedListener$ui() {
        return this.detachedListener;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui() {
        return this.kindSet;
    }

    public final AbstractC1439Aj8 getNode() {
        return this.node;
    }

    public final C1446AjF getOwnerScope$ui() {
        return this.ownerScope;
    }

    public final AbstractC1439Aj8 getParent$ui() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return true;
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
    public final boolean m15isKindH91voCI$ui(int i) {
        return AnonymousClass002.A1L(i & this.kindSet);
    }

    public void markAsAttached$ui() {
        String str;
        if (this.isAttached) {
            str = "node attached multiple times";
        } else {
            if (this.coordinator != null) {
                this.isAttached = true;
                this.onAttachRunExpected = true;
                return;
            }
            str = "attach invoked on a node without a coordinator";
        }
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    public void markAsDetached$ui() {
        String str;
        if (!this.isAttached) {
            str = "Cannot detach a node that is not attached";
        } else if (this.onAttachRunExpected) {
            str = "Must run runAttachLifecycle() before markAsDetached()";
        } else {
            if (!this.onDetachRunExpected) {
                this.isAttached = false;
                C3UX c3ux = this.scope;
                if (c3ux != null) {
                    Hxb.A03(new ModifierNodeDetachedCancellationException(), c3ux);
                    this.scope = null;
                    return;
                }
                return;
            }
            str = "Must run runDetachLifecycle() before markAsDetached()";
        }
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    public void onAttach() {
    }

    public /* synthetic */ void onDensityChange() {
    }

    public void onDetach() {
    }

    public /* synthetic */ void onLayoutDirectionChange() {
    }

    public void onReset() {
    }

    public void reset$ui() {
        if (this.isAttached) {
            onReset();
        } else {
            ASP.A01("reset() called on an unattached node");
            throw F60.createAndThrow();
        }
    }

    public void runAttachLifecycle$ui() {
        String str;
        if (!this.isAttached) {
            str = "Must run markAsAttached() prior to runAttachLifecycle";
        } else {
            if (this.onAttachRunExpected) {
                this.onAttachRunExpected = false;
                onAttach();
                this.onDetachRunExpected = true;
                return;
            }
            str = "Must run runAttachLifecycle() only once after markAsAttached()";
        }
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    public void runDetachLifecycle$ui() {
        String str;
        if (!this.isAttached) {
            str = "node detached multiple times";
        } else if (this.coordinator == null) {
            str = "detach invoked on a node without a coordinator";
        } else {
            if (this.onDetachRunExpected) {
                this.onDetachRunExpected = false;
                Function0<Unit> function0 = this.detachedListener;
                if (function0 != null) {
                    function0.invoke();
                }
                onDetach();
                return;
            }
            str = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()";
        }
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    public static void A0I(Object obj, Map map, float f) {
        map.put(obj, Integer.valueOf(Math.round(f)));
    }

    public final void sideEffect(Function0<Unit> function0) {
        C0912AHo<Function0<Unit>> c0912AHo = ((AndroidComposeView) AbstractC1414Aij.A07(this)).A0b;
        if (c0912AHo.A02(function0) < 0) {
            c0912AHo.A09(function0);
        }
    }

    public final void setAggregateChildKindSet$ui(int i) {
        this.aggregateChildKindSet = i;
    }

    public void setAsDelegateTo$ui(AbstractC1439Aj8 abstractC1439Aj8) {
        this.node = abstractC1439Aj8;
    }

    public final void setChild$ui(AbstractC1439Aj8 abstractC1439Aj8) {
        this.child = abstractC1439Aj8;
    }

    public final void setDetachedListener$ui(Function0<Unit> function0) {
        this.detachedListener = function0;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.insertedNodeAwaitingAttachForInvalidation = z;
    }

    public final void setKindSet$ui(int i) {
        this.kindSet = i;
    }

    public final void setOwnerScope$ui(C1446AjF c1446AjF) {
        this.ownerScope = c1446AjF;
    }

    public final void setParent$ui(AbstractC1439Aj8 abstractC1439Aj8) {
        this.parent = abstractC1439Aj8;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.updatedNodeAwaitingAttachForInvalidation = z;
    }

    public void updateCoordinator$ui(AbstractC1387AiH abstractC1387AiH) {
        this.coordinator = abstractC1387AiH;
    }
}
