package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* loaded from: classes4.dex */
public final class AuY extends Ab8<AuZ> {
    public final C1897AtH A00;
    public final AuP A01;
    public final TextFieldSelectionManager A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuY) {
                AuY auY = (AuY) obj;
                if (!C7384Etj.areEqual(this.A01, auY.A01) || !C7384Etj.areEqual(this.A00, auY.A00) || !C7384Etj.areEqual(this.A02, auY.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AuZ(this.A00, this.A01, this.A02);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        sbA0x.append(this.A01);
        sbA0x.append(", legacyTextFieldState=");
        sbA0x.append(this.A00);
        sbA0x.append(", textFieldSelectionManager=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AuZ auZ = (AuZ) abstractC1439Aj8;
        AuP auP = this.A01;
        if (auZ.isAttached) {
            auZ.A01.AgT();
            auZ.A01.A02(auZ);
        }
        auZ.A01 = auP;
        if (auZ.isAttached) {
            if (auP.A00 != null) {
                throw C3cG.A0Q("Expected textInputModifierNode to be null");
            }
            auP.A00 = auZ;
        }
        auZ.A00 = this.A00;
        auZ.A02 = this.A02;
    }

    public AuY(C1897AtH c1897AtH, AuP auP, TextFieldSelectionManager textFieldSelectionManager) {
        this.A01 = auP;
        this.A00 = c1897AtH;
        this.A02 = textFieldSelectionManager;
    }
}
