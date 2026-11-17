package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C8j2;
import X.C8j5;
import X.HwO;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class TypedReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Action extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final String obscuredBy;
        public final RefResolution resolution;
        public final TransitionEvidence transition;

        public Action(RefResolution refResolution, TransitionEvidence transitionEvidence, String str) {
            C7384Etj.A0Y(transitionEvidence, 1);
            this.resolution = refResolution;
            this.transition = transitionEvidence;
            this.obscuredBy = str;
        }

        public final Action copy(RefResolution refResolution, TransitionEvidence transitionEvidence, String str) {
            C7384Etj.A0Y(transitionEvidence, 1);
            return new Action(refResolution, transitionEvidence, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Action) {
                    Action action = (Action) obj;
                    if (this.resolution != action.resolution || !C7384Etj.areEqual(this.transition, action.transition) || !C7384Etj.areEqual(this.obscuredBy, action.obscuredBy)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Action copy$default(Action action, RefResolution refResolution, TransitionEvidence transitionEvidence, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = action.resolution;
            }
            if ((i & 2) != 0) {
                transitionEvidence = action.transition;
            }
            if ((i & 4) != 0) {
                str = action.obscuredBy;
            }
            return action.copy(refResolution, transitionEvidence, str);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final TransitionEvidence component2() {
            return this.transition;
        }

        public final String component3() {
            return this.obscuredBy;
        }

        public final String getObscuredBy() {
            return this.obscuredBy;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public final TransitionEvidence getTransition() {
            return this.transition;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.transition, AnonymousClass006.A0D(this.resolution) * 31) + AnonymousClass005.A0H(this.obscuredBy);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            TransitionEvidence transitionEvidence = this.transition;
            String str = this.obscuredBy;
            StringBuilder sbA0f = C3cG.A0f(refResolution, "Action(resolution=");
            sbA0f.append(", transition=");
            sbA0f.append(transitionEvidence);
            return C3cJ.A0N(", obscuredBy=", str, sbA0f);
        }
    }

    public final class ActionRefused extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final FailureContext failureContext;

        public ActionRefused(FailureContext failureContext) {
            C7384Etj.A0Y(failureContext, 0);
            this.failureContext = failureContext;
        }

        public final ActionRefused copy(FailureContext failureContext) {
            C7384Etj.A0Y(failureContext, 0);
            return new ActionRefused(failureContext);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ActionRefused) && C7384Etj.areEqual(this.failureContext, ((ActionRefused) obj).failureContext));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ActionRefused copy$default(ActionRefused actionRefused, FailureContext failureContext, int i, Object obj) {
            if ((i & 1) != 0) {
                failureContext = actionRefused.failureContext;
            }
            C7384Etj.A0Y(failureContext, 0);
            return new ActionRefused(failureContext);
        }

        public final FailureContext component1() {
            return this.failureContext;
        }

        public final FailureContext getFailureContext() {
            return this.failureContext;
        }

        public int hashCode() {
            return this.failureContext.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("ActionRefused(failureContext=", this.failureContext);
        }
    }

    public final class Captured extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ChallengeProof challengeProof;
        public final DocumentKey document;
        public final ProtectedImage image;
        public final PageImageLoads imageLoads;
        public final boolean redactionsPresent;
        public final CaptureCrop region;
        public final CoordinateScope scope;
        public final Viewport viewport;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Captured) {
                    Captured captured = (Captured) obj;
                    if (!C7384Etj.areEqual(this.image, captured.image) || !C7384Etj.areEqual(this.document, captured.document) || !C7384Etj.areEqual(this.scope, captured.scope) || !C7384Etj.areEqual(this.viewport, captured.viewport) || this.redactionsPresent != captured.redactionsPresent || !C7384Etj.areEqual(this.region, captured.region) || !C7384Etj.areEqual(this.challengeProof, captured.challengeProof) || !C7384Etj.areEqual(this.imageLoads, captured.imageLoads)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Captured copy$default(Captured captured, ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, ChallengeProof challengeProof, PageImageLoads pageImageLoads, int i, Object obj) {
            if ((i & 1) != 0) {
                protectedImage = captured.image;
            }
            if ((i & 2) != 0) {
                documentKey = captured.document;
            }
            if ((i & 4) != 0) {
                coordinateScope = captured.scope;
            }
            if ((i & 8) != 0) {
                viewport = captured.viewport;
            }
            if ((i & 16) != 0) {
                z = captured.redactionsPresent;
            }
            if ((i & 32) != 0) {
                captureCrop = captured.region;
            }
            if ((i & 64) != 0) {
                challengeProof = captured.challengeProof;
            }
            if ((i & 128) != 0) {
                pageImageLoads = captured.imageLoads;
            }
            return captured.copy(protectedImage, documentKey, coordinateScope, viewport, z, captureCrop, challengeProof, pageImageLoads);
        }

        public final ProtectedImage component1() {
            return this.image;
        }

        public final DocumentKey component2() {
            return this.document;
        }

        public final CoordinateScope component3() {
            return this.scope;
        }

        public final Viewport component4() {
            return this.viewport;
        }

        public final boolean component5() {
            return this.redactionsPresent;
        }

        public final CaptureCrop component6() {
            return this.region;
        }

        public final ChallengeProof component7() {
            return this.challengeProof;
        }

        public final PageImageLoads component8() {
            return this.imageLoads;
        }

        public final ChallengeProof getChallengeProof() {
            return this.challengeProof;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final ProtectedImage getImage() {
            return this.image;
        }

        public final PageImageLoads getImageLoads() {
            return this.imageLoads;
        }

        public final boolean getRedactionsPresent() {
            return this.redactionsPresent;
        }

        public final CaptureCrop getRegion() {
            return this.region;
        }

        public final CoordinateScope getScope() {
            return this.scope;
        }

        public final Viewport getViewport() {
            return this.viewport;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.region, C0KA.A01(AnonymousClass005.A0F(this.viewport, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0F(this.document, AnonymousClass005.A0E(this.image)))), this.redactionsPresent)) + AnonymousClass006.A0D(this.challengeProof)) * 31) + C3cH.A02(this.imageLoads);
        }

        public String toString() {
            ProtectedImage protectedImage = this.image;
            DocumentKey documentKey = this.document;
            CoordinateScope coordinateScope = this.scope;
            Viewport viewport = this.viewport;
            boolean z = this.redactionsPresent;
            CaptureCrop captureCrop = this.region;
            ChallengeProof challengeProof = this.challengeProof;
            PageImageLoads pageImageLoads = this.imageLoads;
            StringBuilder sbA0f = C3cG.A0f(protectedImage, "Captured(image=");
            sbA0f.append(", document=");
            sbA0f.append(documentKey);
            AbstractC7609F5w.A1M(sbA0f, coordinateScope);
            sbA0f.append(", viewport=");
            sbA0f.append(viewport);
            sbA0f.append(", redactionsPresent=");
            sbA0f.append(z);
            sbA0f.append(", region=");
            sbA0f.append(captureCrop);
            sbA0f.append(", challengeProof=");
            sbA0f.append(challengeProof);
            return C3cJ.A0L(pageImageLoads, ", imageLoads=", sbA0f);
        }

        public Captured(ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, ChallengeProof challengeProof, PageImageLoads pageImageLoads) {
            AnonymousClass005.A14(protectedImage, documentKey, coordinateScope, viewport);
            C7384Etj.A0Y(captureCrop, 5);
            this.image = protectedImage;
            this.document = documentKey;
            this.scope = coordinateScope;
            this.viewport = viewport;
            this.redactionsPresent = z;
            this.region = captureCrop;
            this.challengeProof = challengeProof;
            this.imageLoads = pageImageLoads;
        }

        public final Captured copy(ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, ChallengeProof challengeProof, PageImageLoads pageImageLoads) {
            AnonymousClass005.A14(protectedImage, documentKey, coordinateScope, viewport);
            C7384Etj.A0Y(captureCrop, 5);
            return new Captured(protectedImage, documentKey, coordinateScope, viewport, z, captureCrop, challengeProof, pageImageLoads);
        }
    }

    public final class CredentialApplied extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final FillVerification verification;

        public CredentialApplied(FillVerification fillVerification) {
            C7384Etj.A0Y(fillVerification, 0);
            this.verification = fillVerification;
        }

        public final CredentialApplied copy(FillVerification fillVerification) {
            C7384Etj.A0Y(fillVerification, 0);
            return new CredentialApplied(fillVerification);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CredentialApplied) && this.verification == ((CredentialApplied) obj).verification);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CredentialApplied copy$default(CredentialApplied credentialApplied, FillVerification fillVerification, int i, Object obj) {
            if ((i & 1) != 0) {
                fillVerification = credentialApplied.verification;
            }
            C7384Etj.A0Y(fillVerification, 0);
            return new CredentialApplied(fillVerification);
        }

        public final FillVerification component1() {
            return this.verification;
        }

        public final FillVerification getVerification() {
            return this.verification;
        }

        public int hashCode() {
            return this.verification.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("CredentialApplied(verification=", this.verification);
        }
    }

    public final class CredentialCleared extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final FillVerification verification;

        public CredentialCleared(FillVerification fillVerification) {
            C7384Etj.A0Y(fillVerification, 0);
            this.verification = fillVerification;
        }

        public final CredentialCleared copy(FillVerification fillVerification) {
            C7384Etj.A0Y(fillVerification, 0);
            return new CredentialCleared(fillVerification);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CredentialCleared) && this.verification == ((CredentialCleared) obj).verification);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CredentialCleared copy$default(CredentialCleared credentialCleared, FillVerification fillVerification, int i, Object obj) {
            if ((i & 1) != 0) {
                fillVerification = credentialCleared.verification;
            }
            C7384Etj.A0Y(fillVerification, 0);
            return new CredentialCleared(fillVerification);
        }

        public final FillVerification component1() {
            return this.verification;
        }

        public final FillVerification getVerification() {
            return this.verification;
        }

        public int hashCode() {
            return this.verification.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("CredentialCleared(verification=", this.verification);
        }
    }

    public final class CredentialTarget extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final DocumentKey document;
        public final String fillKey;
        public final List<CredentialFieldKind> permittedFields;
        public final CredentialProof proof;
        public final String targetIdentity;

        /* JADX WARN: Multi-variable type inference failed */
        public CredentialTarget(CredentialProof credentialProof, String str, List<? extends CredentialFieldKind> list, DocumentKey documentKey, String str2) {
            AnonymousClass005.A11(credentialProof, list, documentKey, 0);
            this.proof = credentialProof;
            this.targetIdentity = str;
            this.permittedFields = list;
            this.document = documentKey;
            this.fillKey = str2;
        }

        public final CredentialTarget copy(CredentialProof credentialProof, String str, List<? extends CredentialFieldKind> list, DocumentKey documentKey, String str2) {
            AnonymousClass005.A11(credentialProof, list, documentKey, 0);
            return new CredentialTarget(credentialProof, str, list, documentKey, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CredentialTarget) {
                    CredentialTarget credentialTarget = (CredentialTarget) obj;
                    if (!C7384Etj.areEqual(this.proof, credentialTarget.proof) || !C7384Etj.areEqual(this.targetIdentity, credentialTarget.targetIdentity) || !C7384Etj.areEqual(this.permittedFields, credentialTarget.permittedFields) || !C7384Etj.areEqual(this.document, credentialTarget.document) || !C7384Etj.areEqual(this.fillKey, credentialTarget.fillKey)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CredentialTarget copy$default(CredentialTarget credentialTarget, CredentialProof credentialProof, String str, List list, DocumentKey documentKey, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialProof = credentialTarget.proof;
            }
            if ((i & 2) != 0) {
                str = credentialTarget.targetIdentity;
            }
            if ((i & 4) != 0) {
                list = credentialTarget.permittedFields;
            }
            if ((i & 8) != 0) {
                documentKey = credentialTarget.document;
            }
            if ((i & 16) != 0) {
                str2 = credentialTarget.fillKey;
            }
            return credentialTarget.copy(credentialProof, str, list, documentKey, str2);
        }

        public final CredentialProof component1() {
            return this.proof;
        }

        public final String component2() {
            return this.targetIdentity;
        }

        public final List<CredentialFieldKind> component3() {
            return this.permittedFields;
        }

        public final DocumentKey component4() {
            return this.document;
        }

        public final String component5() {
            return this.fillKey;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final String getFillKey() {
            return this.fillKey;
        }

        public final List<CredentialFieldKind> getPermittedFields() {
            return this.permittedFields;
        }

        public final CredentialProof getProof() {
            return this.proof;
        }

        public final String getTargetIdentity() {
            return this.targetIdentity;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.document, AnonymousClass005.A0F(this.permittedFields, (AnonymousClass005.A0E(this.proof) + AnonymousClass006.A0G(this.targetIdentity)) * 31)) + AnonymousClass005.A0H(this.fillKey);
        }

        public String toString() {
            CredentialProof credentialProof = this.proof;
            String str = this.targetIdentity;
            List<CredentialFieldKind> list = this.permittedFields;
            DocumentKey documentKey = this.document;
            String str2 = this.fillKey;
            StringBuilder sbA0f = C3cG.A0f(credentialProof, "CredentialTarget(proof=");
            sbA0f.append(", targetIdentity=");
            sbA0f.append(str);
            sbA0f.append(", permittedFields=");
            sbA0f.append(list);
            sbA0f.append(", document=");
            sbA0f.append(documentKey);
            return C3cJ.A0N(", fillKey=", str2, sbA0f);
        }
    }

    public final class Downloaded extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final long bytes;
        public final String destination;
        public final String mimeType;
        public final String name;
        public final String sha256;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Downloaded) {
                    Downloaded downloaded = (Downloaded) obj;
                    if (!C7384Etj.areEqual(this.destination, downloaded.destination) || !C7384Etj.areEqual(this.name, downloaded.name) || !C7384Etj.areEqual(this.mimeType, downloaded.mimeType) || this.bytes != downloaded.bytes || !C7384Etj.areEqual(this.sha256, downloaded.sha256)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-xiodHJ4$default, reason: not valid java name */
        public static /* synthetic */ Downloaded m3801copyxiodHJ4$default(Downloaded downloaded, String str, String str2, String str3, long j, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloaded.destination;
            }
            if ((i & 2) != 0) {
                str2 = downloaded.name;
            }
            if ((i & 4) != 0) {
                str3 = downloaded.mimeType;
            }
            if ((i & 8) != 0) {
                j = downloaded.bytes;
            }
            if ((i & 16) != 0) {
                str4 = downloaded.sha256;
            }
            return downloaded.m3803copyxiodHJ4(str, str2, str3, j, str4);
        }

        public final String component1() {
            return this.destination;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.mimeType;
        }

        /* renamed from: component4-s-VKNKU, reason: not valid java name */
        public final long m3802component4sVKNKU() {
            return this.bytes;
        }

        public final String component5() {
            return this.sha256;
        }

        /* renamed from: getBytes-s-VKNKU, reason: not valid java name */
        public final long m3804getBytessVKNKU() {
            return this.bytes;
        }

        public final String getDestination() {
            return this.destination;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSha256() {
            return this.sha256;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.sha256, C60R.A00(this.bytes, (AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.destination)) + AnonymousClass006.A0G(this.mimeType)) * 31));
        }

        public String toString() {
            String str = this.destination;
            String str2 = this.name;
            String str3 = this.mimeType;
            String strA00 = HwO.A00(this.bytes);
            String str4 = this.sha256;
            StringBuilder sbA0x = C3cI.A0x("Downloaded(destination=", str);
            AbstractC7611F5y.A0y(sbA0x, str2, str3, strA00);
            return C3cJ.A0N(", sha256=", str4, sbA0x);
        }

        public Downloaded(String str, String str2, String str3, long j, String str4) {
            AnonymousClass003.A0u(str, str2);
            C7384Etj.A0Y(str4, 4);
            this.destination = str;
            this.name = str2;
            this.mimeType = str3;
            this.bytes = j;
            this.sha256 = str4;
        }

        /* renamed from: copy-xiodHJ4, reason: not valid java name */
        public final Downloaded m3803copyxiodHJ4(String str, String str2, String str3, long j, String str4) {
            AnonymousClass003.A0u(str, str2);
            C7384Etj.A0Y(str4, 4);
            return new Downloaded(str, str2, str3, j, str4);
        }

        public /* synthetic */ Downloaded(String str, String str2, String str3, long j, String str4, C06H c06h) {
            this(str, str2, str3, j, str4);
        }
    }

    public final class ElementRead extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final RefResolution resolution;
        public final ElementValue value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ElementRead) {
                    ElementRead elementRead = (ElementRead) obj;
                    if (!C7384Etj.areEqual(this.value, elementRead.value) || this.resolution != elementRead.resolution) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ElementRead copy$default(ElementRead elementRead, ElementValue elementValue, RefResolution refResolution, int i, Object obj) {
            if ((i & 1) != 0) {
                elementValue = elementRead.value;
            }
            if ((i & 2) != 0) {
                refResolution = elementRead.resolution;
            }
            AnonymousClass003.A0u(elementValue, refResolution);
            return new ElementRead(elementValue, refResolution);
        }

        public final ElementValue component1() {
            return this.value;
        }

        public final RefResolution component2() {
            return this.resolution;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public final ElementValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.resolution, AnonymousClass005.A0E(this.value));
        }

        public String toString() {
            return C3cJ.A0L(this.resolution, ", resolution=", C3cG.A0f(this.value, "ElementRead(value="));
        }

        public ElementRead(ElementValue elementValue, RefResolution refResolution) {
            AnonymousClass003.A0u(elementValue, refResolution);
            this.value = elementValue;
            this.resolution = refResolution;
        }

        public final ElementRead copy(ElementValue elementValue, RefResolution refResolution) {
            AnonymousClass003.A0u(elementValue, refResolution);
            return new ElementRead(elementValue, refResolution);
        }
    }

    public final class ElementReads extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final RefResolution resolution;
        public final List<ElementValue> values;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ElementReads) {
                    ElementReads elementReads = (ElementReads) obj;
                    if (!C7384Etj.areEqual(this.values, elementReads.values) || this.resolution != elementReads.resolution) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ElementReads copy$default(ElementReads elementReads, List list, RefResolution refResolution, int i, Object obj) {
            if ((i & 1) != 0) {
                list = elementReads.values;
            }
            if ((i & 2) != 0) {
                refResolution = elementReads.resolution;
            }
            AnonymousClass003.A0u(list, refResolution);
            return new ElementReads(list, refResolution);
        }

        public final List<ElementValue> component1() {
            return this.values;
        }

        public final RefResolution component2() {
            return this.resolution;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public final List<ElementValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.resolution, AnonymousClass005.A0E(this.values));
        }

        public String toString() {
            return C3cJ.A0L(this.resolution, ", resolution=", C3cG.A0f(this.values, "ElementReads(values="));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ElementReads(List<? extends ElementValue> list, RefResolution refResolution) {
            AnonymousClass003.A0u(list, refResolution);
            this.values = list;
            this.resolution = refResolution;
        }

        public final ElementReads copy(List<? extends ElementValue> list, RefResolution refResolution) {
            AnonymousClass003.A0u(list, refResolution);
            return new ElementReads(list, refResolution);
        }
    }

    public final class Fill extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final FillDiagnostics diagnostics;
        public final String observedValue;
        public final RefResolution resolution;
        public final SubmitState submit;
        public final TransitionEvidence transition;
        public final FillVerification verification;

        public static /* synthetic */ Fill copy$default(Fill fill, RefResolution refResolution, FillVerification fillVerification, String str, SubmitState submitState, TransitionEvidence transitionEvidence, FillDiagnostics fillDiagnostics, int i, Object obj) {
            RefResolution refResolution2 = refResolution;
            FillVerification fillVerification2 = fillVerification;
            String str2 = str;
            SubmitState submitState2 = submitState;
            TransitionEvidence transitionEvidence2 = transitionEvidence;
            FillDiagnostics fillDiagnostics2 = fillDiagnostics;
            if ((i & 1) != 0) {
                refResolution2 = fill.resolution;
            }
            if ((i & 2) != 0) {
                fillVerification2 = fill.verification;
            }
            if ((i & 4) != 0) {
                str2 = fill.observedValue;
            }
            if ((i & 8) != 0) {
                submitState2 = fill.submit;
            }
            if ((i & 16) != 0) {
                transitionEvidence2 = fill.transition;
            }
            if ((i & 32) != 0) {
                fillDiagnostics2 = fill.diagnostics;
            }
            AnonymousClass005.A0y(refResolution2, fillVerification2, submitState2);
            return new Fill(refResolution2, fillVerification2, str2, submitState2, transitionEvidence2, fillDiagnostics2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Fill) {
                    Fill fill = (Fill) obj;
                    if (this.resolution != fill.resolution || this.verification != fill.verification || !C7384Etj.areEqual(this.observedValue, fill.observedValue) || this.submit != fill.submit || !C7384Etj.areEqual(this.transition, fill.transition) || !C7384Etj.areEqual(this.diagnostics, fill.diagnostics)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final FillVerification component2() {
            return this.verification;
        }

        public final String component3() {
            return this.observedValue;
        }

        public final SubmitState component4() {
            return this.submit;
        }

        public final TransitionEvidence component5() {
            return this.transition;
        }

        public final FillDiagnostics component6() {
            return this.diagnostics;
        }

        public final FillDiagnostics getDiagnostics() {
            return this.diagnostics;
        }

        public final String getObservedValue() {
            return this.observedValue;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public final SubmitState getSubmit() {
            return this.submit;
        }

        public final TransitionEvidence getTransition() {
            return this.transition;
        }

        public final FillVerification getVerification() {
            return this.verification;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.submit, (AnonymousClass005.A0F(this.verification, AnonymousClass005.A0E(this.resolution)) + AnonymousClass006.A0G(this.observedValue)) * 31) + AnonymousClass006.A0D(this.transition)) * 31) + C3cH.A02(this.diagnostics);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            FillVerification fillVerification = this.verification;
            String str = this.observedValue;
            SubmitState submitState = this.submit;
            TransitionEvidence transitionEvidence = this.transition;
            FillDiagnostics fillDiagnostics = this.diagnostics;
            StringBuilder sbA0f = C3cG.A0f(refResolution, "Fill(resolution=");
            sbA0f.append(C8j2.A00(46));
            sbA0f.append(fillVerification);
            sbA0f.append(", observedValue=");
            sbA0f.append(str);
            sbA0f.append(", submit=");
            sbA0f.append(submitState);
            sbA0f.append(", transition=");
            sbA0f.append(transitionEvidence);
            return C3cJ.A0L(fillDiagnostics, ", diagnostics=", sbA0f);
        }

        public Fill(RefResolution refResolution, FillVerification fillVerification, String str, SubmitState submitState, TransitionEvidence transitionEvidence, FillDiagnostics fillDiagnostics) {
            AnonymousClass005.A0y(refResolution, fillVerification, submitState);
            this.resolution = refResolution;
            this.verification = fillVerification;
            this.observedValue = str;
            this.submit = submitState;
            this.transition = transitionEvidence;
            this.diagnostics = fillDiagnostics;
        }

        public final Fill copy(RefResolution refResolution, FillVerification fillVerification, String str, SubmitState submitState, TransitionEvidence transitionEvidence, FillDiagnostics fillDiagnostics) {
            AnonymousClass005.A0y(refResolution, fillVerification, submitState);
            return new Fill(refResolution, fillVerification, str, submitState, transitionEvidence, fillDiagnostics);
        }
    }

    public final class Focus extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean focused;
        public final RefResolution resolution;

        public Focus(RefResolution refResolution, boolean z) {
            C7384Etj.A0Y(refResolution, 0);
            this.resolution = refResolution;
            this.focused = z;
        }

        public final Focus copy(RefResolution refResolution, boolean z) {
            C7384Etj.A0Y(refResolution, 0);
            return new Focus(refResolution, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Focus) {
                    Focus focus = (Focus) obj;
                    if (this.resolution != focus.resolution || this.focused != focus.focused) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Focus copy$default(Focus focus, RefResolution refResolution, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = focus.resolution;
            }
            if ((i & 2) != 0) {
                z = focus.focused;
            }
            C7384Etj.A0Y(refResolution, 0);
            return new Focus(refResolution, z);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final boolean component2() {
            return this.focused;
        }

        public final boolean getFocused() {
            return this.focused;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.resolution), this.focused);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            return C8j5.A0W(", focused=", C3cG.A0f(refResolution, "Focus(resolution="), this.focused);
        }
    }

    public final class Info extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final DocumentKey document;
        public final PageMetadata metadata;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Info) {
                    Info info = (Info) obj;
                    if (!C7384Etj.areEqual(this.metadata, info.metadata) || !C7384Etj.areEqual(this.document, info.document)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Info copy$default(Info info, PageMetadata pageMetadata, DocumentKey documentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                pageMetadata = info.metadata;
            }
            if ((i & 2) != 0) {
                documentKey = info.document;
            }
            AnonymousClass003.A0u(pageMetadata, documentKey);
            return new Info(pageMetadata, documentKey);
        }

        public final PageMetadata component1() {
            return this.metadata;
        }

        public final DocumentKey component2() {
            return this.document;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final PageMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.document, AnonymousClass005.A0E(this.metadata));
        }

        public String toString() {
            return C3cJ.A0L(this.document, ", document=", C3cG.A0f(this.metadata, "Info(metadata="));
        }

        public Info(PageMetadata pageMetadata, DocumentKey documentKey) {
            AnonymousClass003.A0u(pageMetadata, documentKey);
            this.metadata = pageMetadata;
            this.document = documentKey;
        }

        public final Info copy(PageMetadata pageMetadata, DocumentKey documentKey) {
            AnonymousClass003.A0u(pageMetadata, documentKey);
            return new Info(pageMetadata, documentKey);
        }
    }

    public final class Navigation extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final TransitionEvidence transition;

        public Navigation(TransitionEvidence transitionEvidence) {
            C7384Etj.A0Y(transitionEvidence, 0);
            this.transition = transitionEvidence;
        }

        public final Navigation copy(TransitionEvidence transitionEvidence) {
            C7384Etj.A0Y(transitionEvidence, 0);
            return new Navigation(transitionEvidence);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Navigation) && C7384Etj.areEqual(this.transition, ((Navigation) obj).transition));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Navigation copy$default(Navigation navigation, TransitionEvidence transitionEvidence, int i, Object obj) {
            if ((i & 1) != 0) {
                transitionEvidence = navigation.transition;
            }
            C7384Etj.A0Y(transitionEvidence, 0);
            return new Navigation(transitionEvidence);
        }

        public final TransitionEvidence component1() {
            return this.transition;
        }

        public final TransitionEvidence getTransition() {
            return this.transition;
        }

        public int hashCode() {
            return this.transition.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Navigation(transition=", this.transition);
        }
    }

    public final class Observed extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Observation observation;

        public Observed(Observation observation) {
            C7384Etj.A0Y(observation, 0);
            this.observation = observation;
        }

        public final Observed copy(Observation observation) {
            C7384Etj.A0Y(observation, 0);
            return new Observed(observation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Observed) && C7384Etj.areEqual(this.observation, ((Observed) obj).observation));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Observed copy$default(Observed observed, Observation observation, int i, Object obj) {
            if ((i & 1) != 0) {
                observation = observed.observation;
            }
            C7384Etj.A0Y(observation, 0);
            return new Observed(observation);
        }

        public final Observation component1() {
            return this.observation;
        }

        public final Observation getObservation() {
            return this.observation;
        }

        public int hashCode() {
            return this.observation.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Observed(observation=", this.observation);
        }
    }

    public final class PageRead extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final DocumentKey document;
        public final PageReadKind read;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PageRead) {
                    PageRead pageRead = (PageRead) obj;
                    if (this.read != pageRead.read || !C7384Etj.areEqual(this.text, pageRead.text) || !C7384Etj.areEqual(this.document, pageRead.document)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ PageRead copy$default(PageRead pageRead, PageReadKind pageReadKind, String str, DocumentKey documentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                pageReadKind = pageRead.read;
            }
            if ((i & 2) != 0) {
                str = pageRead.text;
            }
            if ((i & 4) != 0) {
                documentKey = pageRead.document;
            }
            return pageRead.copy(pageReadKind, str, documentKey);
        }

        public final PageReadKind component1() {
            return this.read;
        }

        public final String component2() {
            return this.text;
        }

        public final DocumentKey component3() {
            return this.document;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final PageReadKind getRead() {
            return this.read;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.document, AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.read)));
        }

        public String toString() {
            PageReadKind pageReadKind = this.read;
            String str = this.text;
            DocumentKey documentKey = this.document;
            StringBuilder sbA0f = C3cG.A0f(pageReadKind, "PageRead(read=");
            sbA0f.append(", text=");
            sbA0f.append(str);
            return C3cJ.A0L(documentKey, ", document=", sbA0f);
        }

        public PageRead(PageReadKind pageReadKind, String str, DocumentKey documentKey) {
            AnonymousClass005.A0x(pageReadKind, str, documentKey);
            this.read = pageReadKind;
            this.text = str;
            this.document = documentKey;
        }

        public final PageRead copy(PageReadKind pageReadKind, String str, DocumentKey documentKey) {
            AnonymousClass005.A0x(pageReadKind, str, documentKey);
            return new PageRead(pageReadKind, str, documentKey);
        }
    }

    public final class Pdf extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final String base64;
        public final DocumentKey document;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Pdf) {
                    Pdf pdf = (Pdf) obj;
                    if (!C7384Etj.areEqual(this.base64, pdf.base64) || !C7384Etj.areEqual(this.document, pdf.document)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Pdf copy$default(Pdf pdf, String str, DocumentKey documentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pdf.base64;
            }
            if ((i & 2) != 0) {
                documentKey = pdf.document;
            }
            AnonymousClass003.A0u(str, documentKey);
            return new Pdf(str, documentKey);
        }

        public final String component1() {
            return this.base64;
        }

        public final DocumentKey component2() {
            return this.document;
        }

        public final String getBase64() {
            return this.base64;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.document, AnonymousClass001.A0G(this.base64));
        }

        public String toString() {
            return C3cJ.A0L(this.document, ", document=", C3cI.A0x("Pdf(base64=", this.base64));
        }

        public Pdf(String str, DocumentKey documentKey) {
            AnonymousClass003.A0u(str, documentKey);
            this.base64 = str;
            this.document = documentKey;
        }

        public final Pdf copy(String str, DocumentKey documentKey) {
            AnonymousClass003.A0u(str, documentKey);
            return new Pdf(str, documentKey);
        }
    }

    public final class Scroll extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final RefResolution resolution;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Scroll) && this.resolution == ((Scroll) obj).resolution);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Scroll copy$default(Scroll scroll, RefResolution refResolution, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = scroll.resolution;
            }
            return new Scroll(refResolution);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final Scroll copy(RefResolution refResolution) {
            return new Scroll(refResolution);
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.resolution);
        }

        public String toString() {
            return C3cJ.A0M("Scroll(resolution=", this.resolution);
        }

        public Scroll(RefResolution refResolution) {
            this.resolution = refResolution;
        }
    }

    public final class Select extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean changed;
        public final RefResolution resolution;
        public final boolean selected;
        public final String value;

        public Select(RefResolution refResolution, boolean z, boolean z2, String str) {
            C7384Etj.A0Y(refResolution, 0);
            this.resolution = refResolution;
            this.selected = z;
            this.changed = z2;
            this.value = str;
        }

        public final Select copy(RefResolution refResolution, boolean z, boolean z2, String str) {
            C7384Etj.A0Y(refResolution, 0);
            return new Select(refResolution, z, z2, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Select) {
                    Select select = (Select) obj;
                    if (this.resolution != select.resolution || this.selected != select.selected || this.changed != select.changed || !C7384Etj.areEqual(this.value, select.value)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Select copy$default(Select select, RefResolution refResolution, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = select.resolution;
            }
            if ((i & 2) != 0) {
                z = select.selected;
            }
            if ((i & 4) != 0) {
                z2 = select.changed;
            }
            if ((i & 8) != 0) {
                str = select.value;
            }
            C7384Etj.A0Y(refResolution, 0);
            return new Select(refResolution, z, z2, str);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final boolean component2() {
            return this.selected;
        }

        public final boolean component3() {
            return this.changed;
        }

        public final String component4() {
            return this.value;
        }

        public final boolean getChanged() {
            return this.changed;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.resolution), this.selected), this.changed) + AnonymousClass006.A0G(this.value);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            boolean z = this.selected;
            boolean z2 = this.changed;
            String str = this.value;
            StringBuilder sbA0f = C3cG.A0f(refResolution, "Select(resolution=");
            sbA0f.append(", selected=");
            sbA0f.append(z);
            sbA0f.append(", changed=");
            sbA0f.append(z2);
            return C3cJ.A0N(", value=", str, sbA0f);
        }
    }

    public final class SelectRefused extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final List<String> options;

        public SelectRefused(List<String> list) {
            C7384Etj.A0Y(list, 0);
            this.options = list;
        }

        public final SelectRefused copy(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new SelectRefused(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SelectRefused) && C7384Etj.areEqual(this.options, ((SelectRefused) obj).options));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ SelectRefused copy$default(SelectRefused selectRefused, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = selectRefused.options;
            }
            C7384Etj.A0Y(list, 0);
            return new SelectRefused(list);
        }

        public final List<String> component1() {
            return this.options;
        }

        public final List<String> getOptions() {
            return this.options;
        }

        public int hashCode() {
            return this.options.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("SelectRefused(options=", this.options);
        }
    }

    public final class SetChecked extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean changed;
        public final boolean checked;
        public final RefResolution resolution;

        public SetChecked(RefResolution refResolution, boolean z, boolean z2) {
            C7384Etj.A0Y(refResolution, 0);
            this.resolution = refResolution;
            this.changed = z;
            this.checked = z2;
        }

        public final SetChecked copy(RefResolution refResolution, boolean z, boolean z2) {
            C7384Etj.A0Y(refResolution, 0);
            return new SetChecked(refResolution, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SetChecked) {
                    SetChecked setChecked = (SetChecked) obj;
                    if (this.resolution != setChecked.resolution || this.changed != setChecked.changed || this.checked != setChecked.checked) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ SetChecked copy$default(SetChecked setChecked, RefResolution refResolution, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = setChecked.resolution;
            }
            if ((i & 2) != 0) {
                z = setChecked.changed;
            }
            if ((i & 4) != 0) {
                z2 = setChecked.checked;
            }
            return setChecked.copy(refResolution, z, z2);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final boolean component2() {
            return this.changed;
        }

        public final boolean component3() {
            return this.checked;
        }

        public final boolean getChanged() {
            return this.changed;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.resolution), this.changed), this.checked);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            boolean z = this.changed;
            boolean z2 = this.checked;
            StringBuilder sbA0f = C3cG.A0f(refResolution, "SetChecked(resolution=");
            sbA0f.append(", changed=");
            sbA0f.append(z);
            return C8j5.A0W(", checked=", sbA0f, z2);
        }
    }

    public final class ShopPayApproval extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final boolean alreadyApplied;
        public final boolean applied;
        public final DocumentKey document;

        public ShopPayApproval(boolean z, boolean z2, DocumentKey documentKey) {
            C7384Etj.A0Y(documentKey, 2);
            this.applied = z;
            this.alreadyApplied = z2;
            this.document = documentKey;
        }

        public final ShopPayApproval copy(boolean z, boolean z2, DocumentKey documentKey) {
            C7384Etj.A0Y(documentKey, 2);
            return new ShopPayApproval(z, z2, documentKey);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopPayApproval) {
                    ShopPayApproval shopPayApproval = (ShopPayApproval) obj;
                    if (this.applied != shopPayApproval.applied || this.alreadyApplied != shopPayApproval.alreadyApplied || !C7384Etj.areEqual(this.document, shopPayApproval.document)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ShopPayApproval copy$default(ShopPayApproval shopPayApproval, boolean z, boolean z2, DocumentKey documentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                z = shopPayApproval.applied;
            }
            if ((i & 2) != 0) {
                z2 = shopPayApproval.alreadyApplied;
            }
            if ((i & 4) != 0) {
                documentKey = shopPayApproval.document;
            }
            return shopPayApproval.copy(z, z2, documentKey);
        }

        public final boolean component1() {
            return this.applied;
        }

        public final boolean component2() {
            return this.alreadyApplied;
        }

        public final DocumentKey component3() {
            return this.document;
        }

        public final boolean getAlreadyApplied() {
            return this.alreadyApplied;
        }

        public final boolean getApplied() {
            return this.applied;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.document, C0KA.A01(C0KA.A02(this.applied), this.alreadyApplied));
        }

        public String toString() {
            boolean z = this.applied;
            boolean z2 = this.alreadyApplied;
            DocumentKey documentKey = this.document;
            StringBuilder sbA10 = C60O.A10("ShopPayApproval(applied=", z);
            sbA10.append(", alreadyApplied=");
            sbA10.append(z2);
            return C3cJ.A0L(documentKey, ", document=", sbA10);
        }
    }

    public final class ShopifyCheckout extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final DocumentKey document;
        public final String origin;
        public final String serializedShop;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopifyCheckout) {
                    ShopifyCheckout shopifyCheckout = (ShopifyCheckout) obj;
                    if (!C7384Etj.areEqual(this.serializedShop, shopifyCheckout.serializedShop) || !C7384Etj.areEqual(this.document, shopifyCheckout.document) || !C7384Etj.areEqual(this.origin, shopifyCheckout.origin)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ShopifyCheckout copy$default(ShopifyCheckout shopifyCheckout, String str, DocumentKey documentKey, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shopifyCheckout.serializedShop;
            }
            if ((i & 2) != 0) {
                documentKey = shopifyCheckout.document;
            }
            if ((i & 4) != 0) {
                str2 = shopifyCheckout.origin;
            }
            return shopifyCheckout.copy(str, documentKey, str2);
        }

        public final String component1() {
            return this.serializedShop;
        }

        public final DocumentKey component2() {
            return this.document;
        }

        public final String component3() {
            return this.origin;
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final String getSerializedShop() {
            return this.serializedShop;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.origin, AnonymousClass005.A0F(this.document, AnonymousClass001.A0G(this.serializedShop)));
        }

        public String toString() {
            String str = this.serializedShop;
            DocumentKey documentKey = this.document;
            String str2 = this.origin;
            StringBuilder sbA0x = C3cI.A0x("ShopifyCheckout(serializedShop=", str);
            sbA0x.append(", document=");
            sbA0x.append(documentKey);
            return C3cJ.A0N(", origin=", str2, sbA0x);
        }

        public ShopifyCheckout(String str, DocumentKey documentKey, String str2) {
            AnonymousClass005.A0x(str, documentKey, str2);
            this.serializedShop = str;
            this.document = documentKey;
            this.origin = str2;
        }

        public final ShopifyCheckout copy(String str, DocumentKey documentKey, String str2) {
            AnonymousClass005.A0x(str, documentKey, str2);
            return new ShopifyCheckout(str, documentKey, str2);
        }
    }

    public final class UploadProbed extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final UploadMode mode;
        public final Boolean multiple;
        public final String origin;
        public final RefResolution resolution;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UploadProbed) {
                    UploadProbed uploadProbed = (UploadProbed) obj;
                    if (this.resolution != uploadProbed.resolution || this.mode != uploadProbed.mode || !C7384Etj.areEqual(this.origin, uploadProbed.origin) || !C7384Etj.areEqual(this.multiple, uploadProbed.multiple)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ UploadProbed copy$default(UploadProbed uploadProbed, RefResolution refResolution, UploadMode uploadMode, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                refResolution = uploadProbed.resolution;
            }
            if ((i & 2) != 0) {
                uploadMode = uploadProbed.mode;
            }
            if ((i & 4) != 0) {
                str = uploadProbed.origin;
            }
            if ((i & 8) != 0) {
                bool = uploadProbed.multiple;
            }
            AnonymousClass005.A0x(refResolution, uploadMode, str);
            return new UploadProbed(refResolution, uploadMode, str, bool);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final UploadMode component2() {
            return this.mode;
        }

        public final String component3() {
            return this.origin;
        }

        public final Boolean component4() {
            return this.multiple;
        }

        public final UploadMode getMode() {
            return this.mode;
        }

        public final Boolean getMultiple() {
            return this.multiple;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.origin, AnonymousClass005.A0F(this.mode, AnonymousClass005.A0E(this.resolution))) + AnonymousClass006.A0D(this.multiple);
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            UploadMode uploadMode = this.mode;
            String str = this.origin;
            Boolean bool = this.multiple;
            StringBuilder sbA0f = C3cG.A0f(refResolution, "UploadProbed(resolution=");
            sbA0f.append(", mode=");
            sbA0f.append(uploadMode);
            sbA0f.append(", origin=");
            sbA0f.append(str);
            return C3cJ.A0L(bool, ", multiple=", sbA0f);
        }

        public UploadProbed(RefResolution refResolution, UploadMode uploadMode, String str, Boolean bool) {
            AnonymousClass005.A0x(refResolution, uploadMode, str);
            this.resolution = refResolution;
            this.mode = uploadMode;
            this.origin = str;
            this.multiple = bool;
        }

        public final UploadProbed copy(RefResolution refResolution, UploadMode uploadMode, String str, Boolean bool) {
            AnonymousClass005.A0x(refResolution, uploadMode, str);
            return new UploadProbed(refResolution, uploadMode, str, bool);
        }
    }

    public final class Uploaded extends TypedReceipt {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final UploadDelivery delivery;
        public final int files;
        public final UploadMode mode;
        public final RefResolution resolution;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Uploaded) {
                    Uploaded uploaded = (Uploaded) obj;
                    if (this.resolution != uploaded.resolution || this.mode != uploaded.mode || this.delivery != uploaded.delivery || this.files != uploaded.files) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-hJeF8fQ$default, reason: not valid java name */
        public static /* synthetic */ Uploaded m3805copyhJeF8fQ$default(Uploaded uploaded, RefResolution refResolution, UploadMode uploadMode, UploadDelivery uploadDelivery, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                refResolution = uploaded.resolution;
            }
            if ((i2 & 2) != 0) {
                uploadMode = uploaded.mode;
            }
            if ((i2 & 4) != 0) {
                uploadDelivery = uploaded.delivery;
            }
            if ((i2 & 8) != 0) {
                i = uploaded.files;
            }
            AnonymousClass005.A0x(refResolution, uploadMode, uploadDelivery);
            return new Uploaded(refResolution, uploadMode, uploadDelivery, i);
        }

        public final RefResolution component1() {
            return this.resolution;
        }

        public final UploadMode component2() {
            return this.mode;
        }

        public final UploadDelivery component3() {
            return this.delivery;
        }

        /* renamed from: component4-pVg5ArA, reason: not valid java name */
        public final int m3806component4pVg5ArA() {
            return this.files;
        }

        public final UploadDelivery getDelivery() {
            return this.delivery;
        }

        /* renamed from: getFiles-pVg5ArA, reason: not valid java name */
        public final int m3808getFilespVg5ArA() {
            return this.files;
        }

        public final UploadMode getMode() {
            return this.mode;
        }

        public final RefResolution getResolution() {
            return this.resolution;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.delivery, AnonymousClass005.A0F(this.mode, AnonymousClass005.A0E(this.resolution))) + this.files;
        }

        public String toString() {
            RefResolution refResolution = this.resolution;
            UploadMode uploadMode = this.mode;
            UploadDelivery uploadDelivery = this.delivery;
            String strValueOf = String.valueOf(BV4.A03(this.files));
            StringBuilder sbA0f = C3cG.A0f(refResolution, "Uploaded(resolution=");
            sbA0f.append(", mode=");
            sbA0f.append(uploadMode);
            sbA0f.append(", delivery=");
            sbA0f.append(uploadDelivery);
            return C3cJ.A0N(", files=", strValueOf, sbA0f);
        }

        public Uploaded(RefResolution refResolution, UploadMode uploadMode, UploadDelivery uploadDelivery, int i) {
            AnonymousClass005.A0x(refResolution, uploadMode, uploadDelivery);
            this.resolution = refResolution;
            this.mode = uploadMode;
            this.delivery = uploadDelivery;
            this.files = i;
        }

        /* renamed from: copy-hJeF8fQ, reason: not valid java name */
        public final Uploaded m3807copyhJeF8fQ(RefResolution refResolution, UploadMode uploadMode, UploadDelivery uploadDelivery, int i) {
            AnonymousClass005.A0x(refResolution, uploadMode, uploadDelivery);
            return new Uploaded(refResolution, uploadMode, uploadDelivery, i);
        }

        public /* synthetic */ Uploaded(RefResolution refResolution, UploadMode uploadMode, UploadDelivery uploadDelivery, int i, C06H c06h) {
            this(refResolution, uploadMode, uploadDelivery, i);
        }
    }

    public final class VisualProgram extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final long actions;
        public final String error;
        public final VisualProgramFeedback feedback;
        public final long frames;
        public final String resultJson;

        public VisualProgram(String str, String str2, long j, long j2, VisualProgramFeedback visualProgramFeedback) {
            C7384Etj.A0Y(str, 0);
            this.resultJson = str;
            this.error = str2;
            this.frames = j;
            this.actions = j2;
            this.feedback = visualProgramFeedback;
        }

        /* renamed from: copy-orKg6c4, reason: not valid java name */
        public final VisualProgram m3812copyorKg6c4(String str, String str2, long j, long j2, VisualProgramFeedback visualProgramFeedback) {
            C7384Etj.A0Y(str, 0);
            return new VisualProgram(str, str2, j, j2, visualProgramFeedback);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VisualProgram) {
                    VisualProgram visualProgram = (VisualProgram) obj;
                    if (!C7384Etj.areEqual(this.resultJson, visualProgram.resultJson) || !C7384Etj.areEqual(this.error, visualProgram.error) || this.frames != visualProgram.frames || this.actions != visualProgram.actions || !C7384Etj.areEqual(this.feedback, visualProgram.feedback)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-orKg6c4$default, reason: not valid java name */
        public static /* synthetic */ VisualProgram m3809copyorKg6c4$default(VisualProgram visualProgram, String str, String str2, long j, long j2, VisualProgramFeedback visualProgramFeedback, int i, Object obj) {
            if ((i & 1) != 0) {
                str = visualProgram.resultJson;
            }
            if ((i & 2) != 0) {
                str2 = visualProgram.error;
            }
            if ((i & 4) != 0) {
                j = visualProgram.frames;
            }
            if ((i & 8) != 0) {
                j2 = visualProgram.actions;
            }
            if ((i & 16) != 0) {
                visualProgramFeedback = visualProgram.feedback;
            }
            return visualProgram.m3812copyorKg6c4(str, str2, j, j2, visualProgramFeedback);
        }

        public final String component1() {
            return this.resultJson;
        }

        public final String component2() {
            return this.error;
        }

        /* renamed from: component3-s-VKNKU, reason: not valid java name */
        public final long m3810component3sVKNKU() {
            return this.frames;
        }

        /* renamed from: component4-s-VKNKU, reason: not valid java name */
        public final long m3811component4sVKNKU() {
            return this.actions;
        }

        public final VisualProgramFeedback component5() {
            return this.feedback;
        }

        /* renamed from: getActions-s-VKNKU, reason: not valid java name */
        public final long m3813getActionssVKNKU() {
            return this.actions;
        }

        public final String getError() {
            return this.error;
        }

        public final VisualProgramFeedback getFeedback() {
            return this.feedback;
        }

        /* renamed from: getFrames-s-VKNKU, reason: not valid java name */
        public final long m3814getFramessVKNKU() {
            return this.frames;
        }

        public final String getResultJson() {
            return this.resultJson;
        }

        public int hashCode() {
            return AnonymousClass006.A06(this.actions, AnonymousClass006.A06(this.frames, (AnonymousClass001.A0G(this.resultJson) + AnonymousClass006.A0G(this.error)) * 31)) + C3cH.A02(this.feedback);
        }

        public String toString() {
            String str = this.resultJson;
            String str2 = this.error;
            String strA01 = HwO.A01(this.frames, 10);
            String strA012 = HwO.A01(this.actions, 10);
            VisualProgramFeedback visualProgramFeedback = this.feedback;
            StringBuilder sbA0x = C3cI.A0x("VisualProgram(resultJson=", str);
            sbA0x.append(", error=");
            sbA0x.append(str2);
            sbA0x.append(", frames=");
            sbA0x.append(strA01);
            sbA0x.append(", actions=");
            sbA0x.append(strA012);
            return C3cJ.A0L(visualProgramFeedback, ", feedback=", sbA0x);
        }

        public /* synthetic */ VisualProgram(String str, String str2, long j, long j2, VisualProgramFeedback visualProgramFeedback, C06H c06h) {
            this(str, str2, j, j2, visualProgramFeedback);
        }
    }

    public final class Wait extends TypedReceipt {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final DocumentKey document;
        public final boolean matched;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Wait) {
                    Wait wait = (Wait) obj;
                    if (this.matched != wait.matched || !C7384Etj.areEqual(this.document, wait.document)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Wait copy$default(Wait wait, boolean z, DocumentKey documentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                z = wait.matched;
            }
            if ((i & 2) != 0) {
                documentKey = wait.document;
            }
            return new Wait(z, documentKey);
        }

        public final boolean component1() {
            return this.matched;
        }

        public final DocumentKey component2() {
            return this.document;
        }

        public final Wait copy(boolean z, DocumentKey documentKey) {
            return new Wait(z, documentKey);
        }

        public final DocumentKey getDocument() {
            return this.document;
        }

        public final boolean getMatched() {
            return this.matched;
        }

        public int hashCode() {
            return C0KA.A02(this.matched) + AnonymousClass006.A0D(this.document);
        }

        public String toString() {
            return C3cJ.A0L(this.document, ", document=", C60O.A10("Wait(matched=", this.matched));
        }

        public Wait(boolean z, DocumentKey documentKey) {
            this.matched = z;
            this.document = documentKey;
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public TypedReceipt() {
    }

    public /* synthetic */ TypedReceipt(C06H c06h) {
    }
}
