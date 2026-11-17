package com.facebook.aura.confidentialvm.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C31u;
import X.C7354EnR;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.model.MC;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropBullet;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmArtifact;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.utils.HatchUtil;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchUiState extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final C31u<Object, Boolean> isMigrateOptionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_cvm.cvm_upgrade_downgrade_migrate_option_enabled);
    public final AHD<ConfidentialVmArtifact> artifacts;
    public final ConfidentialVmDataChoice dataChoice;
    public final ConfidentialVmDataMigrationCopy dataMigrationCopy;
    public final ConfidentialVmSwitchDestination destination;
    public final ConfidentialVmSwitchDirection direction;
    public final ConfidentialVmSwitchEntryPoint entryPoint;
    public final boolean hasError;
    public final boolean isJoiningWaitlist;
    public final boolean isLoadingArtifacts;
    public final boolean isLoadingDataMigrationCopy;
    public final boolean isResolvingCredential;
    public final boolean isStartingDowngrade;
    public final ConfidentialVmWaitlistJoinFailure joinWaitlistFailure;
    public final BQI<String> selectedArtifactIds;
    public final boolean showGlassesUnavailableNotice;
    public final ConfidentialVmValuePropsState valuePropsState;

    public final class Companion {
        public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(Companion.class, "isMigrateOptionEnabled", "isMigrateOptionEnabled()Z");

        public final boolean isMigrateOptionEnabled() {
            return C31u.A01(this, ConfidentialVmSwitchUiState.isMigrateOptionEnabled$delegate, $$delegatedProperties, 0);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmSwitchUiState) {
                ConfidentialVmSwitchUiState confidentialVmSwitchUiState = (ConfidentialVmSwitchUiState) obj;
                if (this.destination != confidentialVmSwitchUiState.destination || this.direction != confidentialVmSwitchUiState.direction || this.entryPoint != confidentialVmSwitchUiState.entryPoint || this.dataChoice != confidentialVmSwitchUiState.dataChoice || !C7384Etj.areEqual(this.artifacts, confidentialVmSwitchUiState.artifacts) || !C7384Etj.areEqual(this.selectedArtifactIds, confidentialVmSwitchUiState.selectedArtifactIds) || this.isLoadingArtifacts != confidentialVmSwitchUiState.isLoadingArtifacts || this.isResolvingCredential != confidentialVmSwitchUiState.isResolvingCredential || this.isStartingDowngrade != confidentialVmSwitchUiState.isStartingDowngrade || this.hasError != confidentialVmSwitchUiState.hasError || this.isJoiningWaitlist != confidentialVmSwitchUiState.isJoiningWaitlist || this.joinWaitlistFailure != confidentialVmSwitchUiState.joinWaitlistFailure || !C7384Etj.areEqual(this.valuePropsState, confidentialVmSwitchUiState.valuePropsState) || this.showGlassesUnavailableNotice != confidentialVmSwitchUiState.showGlassesUnavailableNotice || !C7384Etj.areEqual(this.dataMigrationCopy, confidentialVmSwitchUiState.dataMigrationCopy) || this.isLoadingDataMigrationCopy != confidentialVmSwitchUiState.isLoadingDataMigrationCopy) {
                }
            }
            return false;
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmSwitchDestination.NONE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConfidentialVmSwitchDestination.CVM_LOADING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ConfidentialVmSwitchUiState copy$default(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmDataChoice confidentialVmDataChoice, AHD ahd, BQI bqi, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure, ConfidentialVmValuePropsState confidentialVmValuePropsState, boolean z6, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z7, int i, Object obj) {
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination2 = confidentialVmSwitchDestination;
        ConfidentialVmSwitchDirection confidentialVmSwitchDirection2 = confidentialVmSwitchDirection;
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint2 = confidentialVmSwitchEntryPoint;
        ConfidentialVmDataChoice confidentialVmDataChoice2 = confidentialVmDataChoice;
        AHD ahd2 = ahd;
        BQI bqi2 = bqi;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        boolean z12 = z5;
        ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure2 = confidentialVmWaitlistJoinFailure;
        ConfidentialVmValuePropsState confidentialVmValuePropsState2 = confidentialVmValuePropsState;
        boolean z13 = z6;
        ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy2 = confidentialVmDataMigrationCopy;
        boolean z14 = z7;
        if ((i & 1) != 0) {
            confidentialVmSwitchDestination2 = confidentialVmSwitchUiState.destination;
        }
        if ((i & 2) != 0) {
            confidentialVmSwitchDirection2 = confidentialVmSwitchUiState.direction;
        }
        if ((i & 4) != 0) {
            confidentialVmSwitchEntryPoint2 = confidentialVmSwitchUiState.entryPoint;
        }
        if ((i & 8) != 0) {
            confidentialVmDataChoice2 = confidentialVmSwitchUiState.dataChoice;
        }
        if ((i & 16) != 0) {
            ahd2 = confidentialVmSwitchUiState.artifacts;
        }
        if ((i & 32) != 0) {
            bqi2 = confidentialVmSwitchUiState.selectedArtifactIds;
        }
        if ((i & 64) != 0) {
            z8 = confidentialVmSwitchUiState.isLoadingArtifacts;
        }
        if ((i & 128) != 0) {
            z9 = confidentialVmSwitchUiState.isResolvingCredential;
        }
        if ((i & 256) != 0) {
            z10 = confidentialVmSwitchUiState.isStartingDowngrade;
        }
        if ((i & 512) != 0) {
            z11 = confidentialVmSwitchUiState.hasError;
        }
        if ((i & 1024) != 0) {
            z12 = confidentialVmSwitchUiState.isJoiningWaitlist;
        }
        if ((i & 2048) != 0) {
            confidentialVmWaitlistJoinFailure2 = confidentialVmSwitchUiState.joinWaitlistFailure;
        }
        if ((i & 4096) != 0) {
            confidentialVmValuePropsState2 = confidentialVmSwitchUiState.valuePropsState;
        }
        if ((i & 8192) != 0) {
            z13 = confidentialVmSwitchUiState.showGlassesUnavailableNotice;
        }
        if ((i & 16384) != 0) {
            confidentialVmDataMigrationCopy2 = confidentialVmSwitchUiState.dataMigrationCopy;
        }
        if ((i & 32768) != 0) {
            z14 = confidentialVmSwitchUiState.isLoadingDataMigrationCopy;
        }
        ConfidentialVmDataChoice confidentialVmDataChoice3 = confidentialVmDataChoice2;
        return confidentialVmSwitchUiState.copy(confidentialVmSwitchDestination2, confidentialVmSwitchDirection2, confidentialVmSwitchEntryPoint2, confidentialVmDataChoice3, ahd2, bqi2, z8, z9, z10, z11, z12, confidentialVmWaitlistJoinFailure2, confidentialVmValuePropsState2, z13, confidentialVmDataMigrationCopy2, z14);
    }

    private final G0U<ConfidentialVmValueProps, ConfidentialVmValuePropsVariant> getIntroVariant() {
        switch (this.destination.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
                return null;
            case 1:
                return new C7354EnR() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState$introVariant$2
                    @Override // X.C7354EnR, X.InterfaceC7356EnT
                    public Object get(Object obj) {
                        return ((ConfidentialVmValueProps) obj).subscribe;
                    }
                };
            case 2:
                return new C7354EnR() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState$introVariant$1
                    @Override // X.C7354EnR, X.InterfaceC7356EnT
                    public Object get(Object obj) {
                        return ((ConfidentialVmValueProps) obj).f18switch;
                    }
                };
            case 3:
            case 4:
                return new C7354EnR() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState$introVariant$3
                    @Override // X.C7354EnR, X.InterfaceC7356EnT
                    public Object get(Object obj) {
                        return ((ConfidentialVmValueProps) obj).waitlist;
                    }
                };
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ConfidentialVmSwitchDestination component1() {
        return this.destination;
    }

    public final boolean component10() {
        return this.hasError;
    }

    public final boolean component11() {
        return this.isJoiningWaitlist;
    }

    public final ConfidentialVmWaitlistJoinFailure component12() {
        return this.joinWaitlistFailure;
    }

    public final ConfidentialVmValuePropsState component13() {
        return this.valuePropsState;
    }

    public final boolean component14() {
        return this.showGlassesUnavailableNotice;
    }

    public final ConfidentialVmDataMigrationCopy component15() {
        return this.dataMigrationCopy;
    }

    public final boolean component16() {
        return this.isLoadingDataMigrationCopy;
    }

    public final ConfidentialVmSwitchDirection component2() {
        return this.direction;
    }

    public final ConfidentialVmSwitchEntryPoint component3() {
        return this.entryPoint;
    }

    public final ConfidentialVmDataChoice component4() {
        return this.dataChoice;
    }

    public final AHD<ConfidentialVmArtifact> component5() {
        return this.artifacts;
    }

    public final BQI<String> component6() {
        return this.selectedArtifactIds;
    }

    public final boolean component7() {
        return this.isLoadingArtifacts;
    }

    public final boolean component8() {
        return this.isResolvingCredential;
    }

    public final boolean component9() {
        return this.isStartingDowngrade;
    }

    public final AHD<ConfidentialVmArtifact> getArtifacts() {
        return this.artifacts;
    }

    public final boolean getCanContinueDataChoice() {
        return (this.dataChoice == null && Companion.isMigrateOptionEnabled()) ? false : true;
    }

    public final ConfidentialVmDataChoice getDataChoice() {
        return this.dataChoice;
    }

    public final ConfidentialVmDataMigrationCopy getDataMigrationCopy() {
        return this.dataMigrationCopy;
    }

    public final ConfidentialVmSwitchDestination getDestination() {
        return this.destination;
    }

    public final ConfidentialVmSwitchDirection getDirection() {
        return this.direction;
    }

    public final ConfidentialVmSwitchEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final ConfidentialVmValuePropsVariant getIntroCopy() {
        G0U<ConfidentialVmValueProps, ConfidentialVmValuePropsVariant> introVariant;
        ConfidentialVmValueProps valueProps = this.valuePropsState.getValueProps();
        if (valueProps == null || (introVariant = getIntroVariant()) == null) {
            return null;
        }
        return introVariant.invoke(valueProps);
    }

    public final ConfidentialVmWaitlistJoinFailure getJoinWaitlistFailure() {
        return this.joinWaitlistFailure;
    }

    public final boolean getOffersDataTransfer() {
        return Companion.isMigrateOptionEnabled();
    }

    public final BQI<String> getSelectedArtifactIds() {
        return this.selectedArtifactIds;
    }

    public final boolean getShowGlassesUnavailableNotice() {
        return this.showGlassesUnavailableNotice;
    }

    public final boolean getShowsLegalText() {
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination = this.destination;
        return confidentialVmSwitchDestination == ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO || confidentialVmSwitchDestination == ConfidentialVmSwitchDestination.CVM_SUBSCRIBE;
    }

    public final boolean getShowsSvmKeptNotice() {
        return this.direction == ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM && this.dataChoice != null && HatchUtil.INSTANCE.isViewerEmployee() && Companion.isMigrateOptionEnabled();
    }

    public final AHD<ConfidentialVmValuePropBullet> getValuePropBullets() {
        AHD<ConfidentialVmValuePropBullet> ahd;
        ConfidentialVmValueProps valueProps = this.valuePropsState.getValueProps();
        return (valueProps == null || (ahd = valueProps.bullets) == null) ? AHI.A01 : ahd;
    }

    public final ConfidentialVmValuePropsState getValuePropsState() {
        return this.valuePropsState;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(AnonymousClass005.A0F(this.valuePropsState, (C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.selectedArtifactIds, AnonymousClass005.A0F(this.artifacts, (((AnonymousClass005.A0F(this.direction, AnonymousClass005.A0E(this.destination)) + AnonymousClass006.A0D(this.entryPoint)) * 31) + AnonymousClass006.A0D(this.dataChoice)) * 31)), this.isLoadingArtifacts), this.isResolvingCredential), this.isStartingDowngrade), this.hasError), this.isJoiningWaitlist) + AnonymousClass006.A0D(this.joinWaitlistFailure)) * 31), this.showGlassesUnavailableNotice) + C06G.A04(this.dataMigrationCopy)) * 31, this.isLoadingDataMigrationCopy);
    }

    public final boolean isContinuingDataChoice() {
        return this.isLoadingArtifacts || this.isResolvingCredential;
    }

    public final boolean isEncryptionShown() {
        return AnonymousClass006.A1Z(this.destination, ConfidentialVmSwitchDestination.NONE);
    }

    public final boolean isJoiningWaitlist() {
        return this.isJoiningWaitlist;
    }

    public final boolean isLoading() {
        if (this.destination != ConfidentialVmSwitchDestination.CVM_LOADING) {
            return AnonymousClass002.A1X(getIntroVariant()) && C7384Etj.areEqual(this.valuePropsState, ConfidentialVmValuePropsState.Unresolved.INSTANCE);
        }
        return true;
    }

    public final boolean isLoadingArtifacts() {
        return this.isLoadingArtifacts;
    }

    public final boolean isLoadingDataMigrationCopy() {
        return this.isLoadingDataMigrationCopy;
    }

    public final boolean isOnWaitlist() {
        return AnonymousClass002.A1Z(this.destination, ConfidentialVmSwitchDestination.CVM_ON_WAITLIST);
    }

    public final boolean isResolvingCredential() {
        return this.isResolvingCredential;
    }

    public final boolean isStartingDowngrade() {
        return this.isStartingDowngrade;
    }

    public final boolean isSubscriptionRequired() {
        return AnonymousClass002.A1Z(this.destination, ConfidentialVmSwitchDestination.CVM_SUBSCRIBE);
    }

    public final boolean isSwitchingBack() {
        return AnonymousClass002.A1Z(this.direction, ConfidentialVmSwitchDirection.TO_SECURE_VM);
    }

    public final boolean isUnavailable() {
        return AnonymousClass002.A1Z(this.destination, ConfidentialVmSwitchDestination.CVM_UNAVAILABLE);
    }

    public final boolean isWaitlist() {
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination = this.destination;
        return confidentialVmSwitchDestination == ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST || confidentialVmSwitchDestination == ConfidentialVmSwitchDestination.CVM_ON_WAITLIST;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmSwitchUiState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 65535, 0 == true ? 1 : 0);
    }

    private final boolean getShowsValueProps() {
        return AnonymousClass002.A1X(getIntroVariant());
    }

    public final ConfidentialVmSwitchUiState copy(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmDataChoice confidentialVmDataChoice, AHD<ConfidentialVmArtifact> ahd, BQI<String> bqi, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure, ConfidentialVmValuePropsState confidentialVmValuePropsState, boolean z6, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z7) {
        AnonymousClass003.A0u(confidentialVmSwitchDestination, confidentialVmSwitchDirection);
        AnonymousClass003.A0y(ahd, bqi);
        C7384Etj.A0Y(confidentialVmValuePropsState, 12);
        return new ConfidentialVmSwitchUiState(confidentialVmSwitchDestination, confidentialVmSwitchDirection, confidentialVmSwitchEntryPoint, confidentialVmDataChoice, ahd, bqi, z, z2, z3, z4, z5, confidentialVmWaitlistJoinFailure, confidentialVmValuePropsState, z6, confidentialVmDataMigrationCopy, z7);
    }

    public final boolean getConfirmsSwitchWithoutData() {
        return (isSwitchingBack() || Companion.isMigrateOptionEnabled()) ? false : true;
    }

    public final ConfidentialVmDisclosure getIntroDisclosure() {
        ConfidentialVmValueProps valueProps;
        if (!getShowsLegalText() || (valueProps = this.valuePropsState.getValueProps()) == null) {
            return null;
        }
        return valueProps.disclosure;
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmSwitchUiState(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmDataChoice confidentialVmDataChoice, AHD<ConfidentialVmArtifact> ahd, BQI<String> bqi, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure, ConfidentialVmValuePropsState confidentialVmValuePropsState, boolean z6, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z7) {
        AnonymousClass003.A0u(confidentialVmSwitchDestination, confidentialVmSwitchDirection);
        AnonymousClass003.A0y(ahd, bqi);
        C7384Etj.A0Y(confidentialVmValuePropsState, 12);
        this.destination = confidentialVmSwitchDestination;
        this.direction = confidentialVmSwitchDirection;
        this.entryPoint = confidentialVmSwitchEntryPoint;
        this.dataChoice = confidentialVmDataChoice;
        this.artifacts = ahd;
        this.selectedArtifactIds = bqi;
        this.isLoadingArtifacts = z;
        this.isResolvingCredential = z2;
        this.isStartingDowngrade = z3;
        this.hasError = z4;
        this.isJoiningWaitlist = z5;
        this.joinWaitlistFailure = confidentialVmWaitlistJoinFailure;
        this.valuePropsState = confidentialVmValuePropsState;
        this.showGlassesUnavailableNotice = z6;
        this.dataMigrationCopy = confidentialVmDataMigrationCopy;
        this.isLoadingDataMigrationCopy = z7;
    }

    public /* synthetic */ ConfidentialVmSwitchUiState(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmDataChoice confidentialVmDataChoice, AHD ahd, BQI bqi, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure, ConfidentialVmValuePropsState confidentialVmValuePropsState, boolean z6, ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z7, int i, C06H c06h) {
        this((i & 1) != 0 ? ConfidentialVmSwitchDestination.NONE : confidentialVmSwitchDestination, (i & 2) != 0 ? ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM : confidentialVmSwitchDirection, (i & 4) != 0 ? null : confidentialVmSwitchEntryPoint, (i & 8) != 0 ? null : confidentialVmDataChoice, (i & 16) != 0 ? AHI.A01 : ahd, (i & 32) != 0 ? C0943AIw.A03 : bqi, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : confidentialVmWaitlistJoinFailure, (i & 4096) != 0 ? ConfidentialVmValuePropsState.Unresolved.INSTANCE : confidentialVmValuePropsState, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? null : confidentialVmDataMigrationCopy, C06G.A0o(i, 32768, z7));
    }
}
