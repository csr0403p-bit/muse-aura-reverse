package com.facebook.aura.confidentialvm.repository;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmValueProps extends C06G {
    public final AHD<ConfidentialVmValuePropBullet> bullets;
    public final ConfidentialVmDataMigrationCopy dataMigrationToConfidentialVm;
    public final ConfidentialVmDataMigrationCopy dataMigrationToSecureVm;
    public final ConfidentialVmDisclosure disclosure;
    public final ConfidentialVmValuePropsVariant subscribe;

    /* renamed from: switch, reason: not valid java name */
    public final ConfidentialVmValuePropsVariant f18switch;
    public final ConfidentialVmValuePropsVariant tryIt;
    public final ConfidentialVmValuePropsVariant waitlist;

    public ConfidentialVmValueProps(AHD<ConfidentialVmValuePropBullet> ahd, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant2, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant3, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant4, ConfidentialVmDisclosure confidentialVmDisclosure, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy2) {
        C7384Etj.A0Y(ahd, 0);
        this.bullets = ahd;
        this.waitlist = confidentialVmValuePropsVariant;
        this.tryIt = confidentialVmValuePropsVariant2;
        this.subscribe = confidentialVmValuePropsVariant3;
        this.f18switch = confidentialVmValuePropsVariant4;
        this.disclosure = confidentialVmDisclosure;
        this.dataMigrationToConfidentialVm = confidentialVmDataMigrationCopy;
        this.dataMigrationToSecureVm = confidentialVmDataMigrationCopy2;
    }

    public final ConfidentialVmValueProps copy(AHD<ConfidentialVmValuePropBullet> ahd, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant2, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant3, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant4, ConfidentialVmDisclosure confidentialVmDisclosure, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy2) {
        C7384Etj.A0Y(ahd, 0);
        return new ConfidentialVmValueProps(ahd, confidentialVmValuePropsVariant, confidentialVmValuePropsVariant2, confidentialVmValuePropsVariant3, confidentialVmValuePropsVariant4, confidentialVmDisclosure, confidentialVmDataMigrationCopy, confidentialVmDataMigrationCopy2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValueProps) {
                ConfidentialVmValueProps confidentialVmValueProps = (ConfidentialVmValueProps) obj;
                if (!C7384Etj.areEqual(this.bullets, confidentialVmValueProps.bullets) || !C7384Etj.areEqual(this.waitlist, confidentialVmValueProps.waitlist) || !C7384Etj.areEqual(this.tryIt, confidentialVmValueProps.tryIt) || !C7384Etj.areEqual(this.subscribe, confidentialVmValueProps.subscribe) || !C7384Etj.areEqual(this.f18switch, confidentialVmValueProps.f18switch) || !C7384Etj.areEqual(this.disclosure, confidentialVmValueProps.disclosure) || !C7384Etj.areEqual(this.dataMigrationToConfidentialVm, confidentialVmValueProps.dataMigrationToConfidentialVm) || !C7384Etj.areEqual(this.dataMigrationToSecureVm, confidentialVmValueProps.dataMigrationToSecureVm)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmValueProps copy$default(ConfidentialVmValueProps confidentialVmValueProps, AHD ahd, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant2, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant3, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant4, ConfidentialVmDisclosure confidentialVmDisclosure, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = confidentialVmValueProps.bullets;
        }
        if ((i & 2) != 0) {
            confidentialVmValuePropsVariant = confidentialVmValueProps.waitlist;
        }
        if ((i & 4) != 0) {
            confidentialVmValuePropsVariant2 = confidentialVmValueProps.tryIt;
        }
        if ((i & 8) != 0) {
            confidentialVmValuePropsVariant3 = confidentialVmValueProps.subscribe;
        }
        if ((i & 16) != 0) {
            confidentialVmValuePropsVariant4 = confidentialVmValueProps.f18switch;
        }
        if ((i & 32) != 0) {
            confidentialVmDisclosure = confidentialVmValueProps.disclosure;
        }
        if ((i & 64) != 0) {
            confidentialVmDataMigrationCopy = confidentialVmValueProps.dataMigrationToConfidentialVm;
        }
        if ((i & 128) != 0) {
            confidentialVmDataMigrationCopy2 = confidentialVmValueProps.dataMigrationToSecureVm;
        }
        return confidentialVmValueProps.copy(ahd, confidentialVmValuePropsVariant, confidentialVmValuePropsVariant2, confidentialVmValuePropsVariant3, confidentialVmValuePropsVariant4, confidentialVmDisclosure, confidentialVmDataMigrationCopy, confidentialVmDataMigrationCopy2);
    }

    public final AHD<ConfidentialVmValuePropBullet> component1() {
        return this.bullets;
    }

    public final ConfidentialVmValuePropsVariant component2() {
        return this.waitlist;
    }

    public final ConfidentialVmValuePropsVariant component3() {
        return this.tryIt;
    }

    public final ConfidentialVmValuePropsVariant component4() {
        return this.subscribe;
    }

    public final ConfidentialVmValuePropsVariant component5() {
        return this.f18switch;
    }

    public final ConfidentialVmDisclosure component6() {
        return this.disclosure;
    }

    public final ConfidentialVmDataMigrationCopy component7() {
        return this.dataMigrationToConfidentialVm;
    }

    public final ConfidentialVmDataMigrationCopy component8() {
        return this.dataMigrationToSecureVm;
    }

    public final AHD<ConfidentialVmValuePropBullet> getBullets() {
        return this.bullets;
    }

    public final ConfidentialVmDataMigrationCopy getDataMigrationToConfidentialVm() {
        return this.dataMigrationToConfidentialVm;
    }

    public final ConfidentialVmDataMigrationCopy getDataMigrationToSecureVm() {
        return this.dataMigrationToSecureVm;
    }

    public final ConfidentialVmDisclosure getDisclosure() {
        return this.disclosure;
    }

    public final ConfidentialVmValuePropsVariant getSubscribe() {
        return this.subscribe;
    }

    public final ConfidentialVmValuePropsVariant getSwitch() {
        return this.f18switch;
    }

    public final ConfidentialVmValuePropsVariant getTryIt() {
        return this.tryIt;
    }

    public final ConfidentialVmValuePropsVariant getWaitlist() {
        return this.waitlist;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0E(this.bullets) + AnonymousClass006.A0D(this.waitlist)) * 31) + AnonymousClass006.A0D(this.tryIt)) * 31) + AnonymousClass006.A0D(this.subscribe)) * 31) + AnonymousClass006.A0D(this.f18switch)) * 31) + AnonymousClass006.A0D(this.disclosure)) * 31) + AnonymousClass006.A0D(this.dataMigrationToConfidentialVm)) * 31) + C06G.A04(this.dataMigrationToSecureVm);
    }

    public String toString() {
        return super.toString();
    }
}
