package X;

/* renamed from: X.Aj6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1437Aj6 extends AbstractC1439Aj8 {
    public AbstractC1439Aj8 A00;
    public final int A01 = AbstractC1436Aj5.A01(this);

    /* JADX WARN: Incorrect return type in method signature: <T::LX/1Z3;>(TT;)TT; */
    public final void A0G(C1Z3 c1z3) {
        String string;
        AbstractC1439Aj8 abstractC1439Aj8 = (AbstractC1439Aj8) c1z3;
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.node;
        if (abstractC1439Aj82 != c1z3) {
            AbstractC1439Aj8 abstractC1439Aj83 = c1z3 instanceof AbstractC1439Aj8 ? abstractC1439Aj8.parent : null;
            if (abstractC1439Aj82 != this.node || !C7384Etj.areEqual(abstractC1439Aj83, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (abstractC1439Aj82.isAttached) {
            string = "Cannot delegate to an already attached node";
        } else {
            abstractC1439Aj82.setAsDelegateTo$ui(this.node);
            int i = this.kindSet;
            int iA02 = AbstractC1436Aj5.A02(abstractC1439Aj82);
            abstractC1439Aj82.kindSet = iA02;
            int i2 = this.kindSet;
            int i3 = iA02 & 2;
            if (i3 == 0 || (i2 & 2) == 0 || (this instanceof InterfaceC1356Ahh)) {
                abstractC1439Aj82.child = this.A00;
                this.A00 = abstractC1439Aj82;
                abstractC1439Aj82.parent = this;
                A0F(i2 | iA02, false);
                if (this.isAttached) {
                    if (i3 == 0 || (i & 2) != 0) {
                        updateCoordinator$ui(this.coordinator);
                    } else {
                        C1438Aj7 c1438Aj7 = AbstractC1414Aij.A04(this).A0f;
                        this.node.updateCoordinator$ui(null);
                        c1438Aj7.A08();
                    }
                    abstractC1439Aj82.markAsAttached$ui();
                    abstractC1439Aj82.runAttachLifecycle$ui();
                    AbstractC1436Aj5.A03(abstractC1439Aj82);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            sb.append(this);
            sb.append("\nDelegate Node: ");
            sb.append(abstractC1439Aj82);
            string = sb.toString();
        }
        ASP.A01(string);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A0F(int i, boolean z) {
        int i2 = this.kindSet;
        this.kindSet = i;
        if (i2 != i) {
            AbstractC1439Aj8 abstractC1439Aj8 = this.node;
            if (abstractC1439Aj8 == this) {
                this.aggregateChildKindSet = i;
            }
            if (this.isAttached) {
                do {
                    i |= this.kindSet;
                    this.kindSet = i;
                    if (this == abstractC1439Aj8) {
                        break;
                    } else {
                        this = this.parent;
                    }
                } while (this != 0);
                if (z && this == abstractC1439Aj8) {
                    i = AbstractC1436Aj5.A02(abstractC1439Aj8);
                    abstractC1439Aj8.kindSet = i;
                }
                if (this != 0) {
                    AbstractC1439Aj8 abstractC1439Aj82 = this.child;
                    int i3 = i | (abstractC1439Aj82 != null ? abstractC1439Aj82.aggregateChildKindSet : 0);
                    do {
                        i3 |= this.kindSet;
                        this.aggregateChildKindSet = i3;
                        this = this.parent;
                    } while (this != 0);
                }
            }
        }
    }

    public final void A0H(C1Z3 c1z3) {
        AbstractC1439Aj8 abstractC1439Aj8 = null;
        for (AbstractC1439Aj8 abstractC1439Aj82 = this.A00; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
            if (abstractC1439Aj82 == c1z3) {
                if (abstractC1439Aj82.isAttached) {
                    AbstractC1436Aj5.A05(abstractC1439Aj82, -1, 2);
                    abstractC1439Aj82.runDetachLifecycle$ui();
                    abstractC1439Aj82.markAsDetached$ui();
                }
                abstractC1439Aj82.setAsDelegateTo$ui(abstractC1439Aj82);
                abstractC1439Aj82.aggregateChildKindSet = 0;
                AbstractC1439Aj8 abstractC1439Aj83 = abstractC1439Aj82.child;
                if (abstractC1439Aj8 == null) {
                    this.A00 = abstractC1439Aj83;
                } else {
                    abstractC1439Aj8.child = abstractC1439Aj83;
                }
                abstractC1439Aj82.child = null;
                abstractC1439Aj82.parent = null;
                int i = this.kindSet;
                int iA02 = AbstractC1436Aj5.A02(this);
                A0F(iA02, true);
                if (this.isAttached && (i & 2) != 0 && (iA02 & 2) == 0) {
                    C1438Aj7 c1438Aj7 = AbstractC1414Aij.A04(this).A0f;
                    this.node.updateCoordinator$ui(null);
                    c1438Aj7.A08();
                    return;
                }
                return;
            }
            abstractC1439Aj8 = abstractC1439Aj82;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("Could not find delegate: ", c1z3));
    }

    @Override // X.AbstractC1439Aj8
    public final void markAsDetached$ui() {
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // X.AbstractC1439Aj8
    public final void runAttachLifecycle$ui() {
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // X.AbstractC1439Aj8
    public final void setAsDelegateTo$ui(AbstractC1439Aj8 abstractC1439Aj8) {
        this.node = abstractC1439Aj8;
        for (AbstractC1439Aj8 abstractC1439Aj82 = this.A00; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
            abstractC1439Aj82.setAsDelegateTo$ui(abstractC1439Aj8);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void updateCoordinator$ui(AbstractC1387AiH abstractC1387AiH) {
        this.coordinator = abstractC1387AiH;
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.updateCoordinator$ui(abstractC1387AiH);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.updateCoordinator$ui(this.coordinator);
            if (!abstractC1439Aj8.isAttached) {
                abstractC1439Aj8.markAsAttached$ui();
            }
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void reset$ui() {
        super.reset$ui();
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.reset$ui();
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A00; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.runDetachLifecycle$ui();
        }
    }
}
