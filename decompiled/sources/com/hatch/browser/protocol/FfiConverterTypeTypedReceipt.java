package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import com.hatch.browser.protocol.TypedReceipt;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTypedReceipt implements FfiConverterRustBuffer<TypedReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTypedReceipt INSTANCE = new FfiConverterTypeTypedReceipt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(TypedReceipt typedReceipt) {
        long jMo3323allocationSizeI7RO_PI;
        long jA0R;
        long jMo3323allocationSizeI7RO_PI2;
        C7384Etj.A0Y(typedReceipt, 0);
        if (!(typedReceipt instanceof TypedReceipt.VisualProgram)) {
            if (typedReceipt instanceof TypedReceipt.Observed) {
                jMo3323allocationSizeI7RO_PI = FfiConverterTypeObservation.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.Observed) typedReceipt).observation);
            } else if (typedReceipt instanceof TypedReceipt.Info) {
                TypedReceipt.Info info = (TypedReceipt.Info) typedReceipt;
                jA0R = FfiConverterTypePageMetadata.INSTANCE.mo3323allocationSizeI7RO_PI(info.metadata) + 4;
                jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(info.document);
            } else if (typedReceipt instanceof TypedReceipt.PageRead) {
                TypedReceipt.PageRead pageRead = (TypedReceipt.PageRead) typedReceipt;
                jA0R = AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, pageRead.text, 8L);
                jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(pageRead.document);
            } else if (typedReceipt instanceof TypedReceipt.ElementRead) {
                jA0R = FfiConverterTypeElementValue.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.ElementRead) typedReceipt).value) + 4;
                jMo3323allocationSizeI7RO_PI2 = 4;
            } else if (typedReceipt instanceof TypedReceipt.ElementReads) {
                jA0R = FfiConverterSequenceTypeElementValue.INSTANCE.mo3323allocationSizeI7RO_PI((List<? extends ElementValue>) ((TypedReceipt.ElementReads) typedReceipt).values) + 4;
                jMo3323allocationSizeI7RO_PI2 = 4;
            } else if (typedReceipt instanceof TypedReceipt.Wait) {
                jA0R = 5;
                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.Wait) typedReceipt).document);
            } else if (typedReceipt instanceof TypedReceipt.Action) {
                TypedReceipt.Action action = (TypedReceipt.Action) typedReceipt;
                jA0R = AbstractC7610F5x.A0W(action.resolution) + 4 + FfiConverterTypeTransitionEvidence.INSTANCE.mo3323allocationSizeI7RO_PI(action.transition);
                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(action.obscuredBy);
            } else if (typedReceipt instanceof TypedReceipt.ActionRefused) {
                jMo3323allocationSizeI7RO_PI = FfiConverterTypeFailureContext.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.ActionRefused) typedReceipt).failureContext);
            } else if (typedReceipt instanceof TypedReceipt.SelectRefused) {
                jMo3323allocationSizeI7RO_PI = FfiConverterSequenceString.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.SelectRefused) typedReceipt).options);
            } else if (typedReceipt instanceof TypedReceipt.Focus) {
                jA0R = 8;
                jMo3323allocationSizeI7RO_PI2 = 1;
            } else if (typedReceipt instanceof TypedReceipt.Fill) {
                TypedReceipt.Fill fill = (TypedReceipt.Fill) typedReceipt;
                jA0R = 12 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(fill.observedValue) + 4 + FfiConverterOptionalTypeTransitionEvidence.INSTANCE.mo3323allocationSizeI7RO_PI(fill.transition);
                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypeFillDiagnostics.INSTANCE.mo3323allocationSizeI7RO_PI(fill.diagnostics);
            } else if (typedReceipt instanceof TypedReceipt.Select) {
                jA0R = 10;
                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.Select) typedReceipt).value);
            } else if (typedReceipt instanceof TypedReceipt.SetChecked) {
                jA0R = 9;
                jMo3323allocationSizeI7RO_PI2 = 1;
            } else if (typedReceipt instanceof TypedReceipt.Scroll) {
                jMo3323allocationSizeI7RO_PI = AbstractC7610F5x.A0W(((TypedReceipt.Scroll) typedReceipt).resolution);
            } else if (typedReceipt instanceof TypedReceipt.Navigation) {
                jMo3323allocationSizeI7RO_PI = FfiConverterTypeTransitionEvidence.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.Navigation) typedReceipt).transition);
            } else if (typedReceipt instanceof TypedReceipt.CredentialTarget) {
                TypedReceipt.CredentialTarget credentialTarget = (TypedReceipt.CredentialTarget) typedReceipt;
                long jMo3323allocationSizeI7RO_PI3 = FfiConverterTypeCredentialProof.INSTANCE.mo3323allocationSizeI7RO_PI(credentialTarget.proof) + 4;
                FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                jA0R = jMo3323allocationSizeI7RO_PI3 + ffiConverterOptionalString.mo3323allocationSizeI7RO_PI(credentialTarget.targetIdentity) + FfiConverterSequenceTypeCredentialFieldKind.INSTANCE.mo3323allocationSizeI7RO_PI((List<? extends CredentialFieldKind>) credentialTarget.permittedFields) + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(credentialTarget.document);
                jMo3323allocationSizeI7RO_PI2 = ffiConverterOptionalString.mo3323allocationSizeI7RO_PI(credentialTarget.fillKey);
            } else if ((typedReceipt instanceof TypedReceipt.CredentialApplied) || (typedReceipt instanceof TypedReceipt.CredentialCleared)) {
                jMo3323allocationSizeI7RO_PI = 4;
            } else if (typedReceipt instanceof TypedReceipt.ShopifyCheckout) {
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                TypedReceipt.ShopifyCheckout shopifyCheckout = (TypedReceipt.ShopifyCheckout) typedReceipt;
                jA0R = ffiConverterString.mo3323allocationSizeI7RO_PI(shopifyCheckout.serializedShop) + 4 + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(shopifyCheckout.document);
                jMo3323allocationSizeI7RO_PI2 = ffiConverterString.mo3323allocationSizeI7RO_PI(shopifyCheckout.origin);
            } else if (typedReceipt instanceof TypedReceipt.ShopPayApproval) {
                jA0R = 6;
                jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(((TypedReceipt.ShopPayApproval) typedReceipt).document);
            } else if (typedReceipt instanceof TypedReceipt.Captured) {
                TypedReceipt.Captured captured = (TypedReceipt.Captured) typedReceipt;
                long jMo3323allocationSizeI7RO_PI4 = FfiConverterTypeProtectedImage.INSTANCE.mo3323allocationSizeI7RO_PI(captured.image) + 4 + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(captured.document) + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(captured.scope) + FfiConverterTypeViewport.INSTANCE.mo3323allocationSizeI7RO_PI(captured.viewport) + 1;
                C7384Etj.A0Y(captured.region, 0);
                jA0R = jMo3323allocationSizeI7RO_PI4 + 32 + FfiConverterOptionalTypeChallengeProof.INSTANCE.mo3323allocationSizeI7RO_PI(captured.challengeProof);
                jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypePageImageLoads.INSTANCE.mo3323allocationSizeI7RO_PI(captured.imageLoads);
            } else if (typedReceipt instanceof TypedReceipt.Pdf) {
                TypedReceipt.Pdf pdf = (TypedReceipt.Pdf) typedReceipt;
                jA0R = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(pdf.base64) + 4;
                jMo3323allocationSizeI7RO_PI2 = FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(pdf.document);
            } else if (typedReceipt instanceof TypedReceipt.Uploaded) {
                jA0R = 16;
                jMo3323allocationSizeI7RO_PI2 = 4;
            } else if (typedReceipt instanceof TypedReceipt.UploadProbed) {
                TypedReceipt.UploadProbed uploadProbed = (TypedReceipt.UploadProbed) typedReceipt;
                jA0R = AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, uploadProbed.origin, 12L);
                jMo3323allocationSizeI7RO_PI2 = AbstractC7610F5x.A0V(uploadProbed.multiple);
            } else {
                if (!(typedReceipt instanceof TypedReceipt.Downloaded)) {
                    throw C3cG.A0q();
                }
                FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
                TypedReceipt.Downloaded downloaded = (TypedReceipt.Downloaded) typedReceipt;
                jA0R = AbstractC7607F5u.A0R(ffiConverterString2, downloaded.name, ffiConverterString2.mo3323allocationSizeI7RO_PI(downloaded.destination) + 4) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(downloaded.mimeType) + 8;
                jMo3323allocationSizeI7RO_PI2 = ffiConverterString2.mo3323allocationSizeI7RO_PI(downloaded.sha256);
            }
            return jMo3323allocationSizeI7RO_PI + 4;
        }
        TypedReceipt.VisualProgram visualProgram = (TypedReceipt.VisualProgram) typedReceipt;
        jA0R = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(visualProgram.resultJson) + 4 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(visualProgram.error) + 8 + 8;
        jMo3323allocationSizeI7RO_PI2 = FfiConverterOptionalTypeVisualProgramFeedback.INSTANCE.mo3323allocationSizeI7RO_PI(visualProgram.feedback);
        return jA0R + jMo3323allocationSizeI7RO_PI2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ TypedReceipt lift(RustBuffer.ByValue byValue) {
        return (TypedReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ TypedReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TypedReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(TypedReceipt typedReceipt) {
        return lower((Object) typedReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(TypedReceipt typedReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, typedReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public TypedReceipt read(ByteBuffer byteBuffer) {
        switch (AbstractC7609F5w.A0H(byteBuffer)) {
            case 1:
                return new TypedReceipt.VisualProgram(AbstractC7607F5u.A12(byteBuffer), AbstractC7607F5u.A11(byteBuffer), byteBuffer.getLong(), byteBuffer.getLong(), FfiConverterOptionalTypeVisualProgramFeedback.INSTANCE.read(byteBuffer));
            case 2:
                return new TypedReceipt.Observed(FfiConverterTypeObservation.INSTANCE.read(byteBuffer));
            case 3:
                return new TypedReceipt.Info(FfiConverterTypePageMetadata.INSTANCE.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)));
            case 4:
                return new TypedReceipt.PageRead(FfiConverterTypePageReadKind.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)));
            case 5:
                return new TypedReceipt.ElementRead(FfiConverterTypeElementValue.INSTANCE.read(byteBuffer), FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer));
            case 6:
                return new TypedReceipt.ElementReads(FfiConverterSequenceTypeElementValue.INSTANCE.read(byteBuffer), FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer));
            case 7:
                return new TypedReceipt.Wait(AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), FfiConverterOptionalTypeDocumentKey.INSTANCE.read(byteBuffer));
            case 8:
                return new TypedReceipt.Action(FfiConverterOptionalTypeRefResolution.INSTANCE.read(byteBuffer), FfiConverterTypeTransitionEvidence.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
            case 9:
                return new TypedReceipt.ActionRefused(new FailureContext(AbstractC7610F5x.A0z(byteBuffer)));
            case 10:
                return new TypedReceipt.SelectRefused(FfiConverterSequenceString.INSTANCE.read(byteBuffer));
            case 11:
                return new TypedReceipt.Focus(FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
            case 12:
                return new TypedReceipt.Fill(FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer), FfiConverterTypeFillVerification.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), FfiConverterTypeSubmitState.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeTransitionEvidence.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeFillDiagnostics.INSTANCE.read(byteBuffer));
            case 13:
                RefResolution refResolution = FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer);
                FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
                return new TypedReceipt.Select(refResolution, AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7607F5u.A11(byteBuffer));
            case 14:
                RefResolution refResolution2 = FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer);
                FfiConverterBoolean ffiConverterBoolean2 = FfiConverterBoolean.INSTANCE;
                return new TypedReceipt.SetChecked(refResolution2, AbstractC7610F5x.A1V(ffiConverterBoolean2, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean2, byteBuffer));
            case 15:
                return new TypedReceipt.Scroll(FfiConverterOptionalTypeRefResolution.INSTANCE.read(byteBuffer));
            case 16:
                return new TypedReceipt.Navigation(FfiConverterTypeTransitionEvidence.INSTANCE.read(byteBuffer));
            case 17:
                CredentialProof credentialProof = new CredentialProof(AbstractC7610F5x.A0z(byteBuffer));
                FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                return new TypedReceipt.CredentialTarget(credentialProof, ffiConverterOptionalString.read(byteBuffer), FfiConverterSequenceTypeCredentialFieldKind.INSTANCE.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), ffiConverterOptionalString.read(byteBuffer));
            case 18:
                return new TypedReceipt.CredentialApplied(FfiConverterTypeFillVerification.INSTANCE.read(byteBuffer));
            case 19:
                return new TypedReceipt.CredentialCleared(FfiConverterTypeFillVerification.INSTANCE.read(byteBuffer));
            case 20:
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                return new TypedReceipt.ShopifyCheckout(ffiConverterString.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), ffiConverterString.read(byteBuffer));
            case 21:
                FfiConverterBoolean ffiConverterBoolean3 = FfiConverterBoolean.INSTANCE;
                return new TypedReceipt.ShopPayApproval(AbstractC7610F5x.A1V(ffiConverterBoolean3, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean3, byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)));
            case 22:
                return new TypedReceipt.Captured(FfiConverterTypeProtectedImage.INSTANCE.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), FfiConverterTypeViewport.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), FfiConverterTypeCaptureCrop.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeChallengeProof.INSTANCE.read(byteBuffer), FfiConverterOptionalTypePageImageLoads.INSTANCE.read(byteBuffer));
            case 23:
                return new TypedReceipt.Pdf(AbstractC7607F5u.A12(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)));
            case 24:
                return new TypedReceipt.Uploaded(FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer), FfiConverterTypeUploadMode.INSTANCE.read(byteBuffer), FfiConverterTypeUploadDelivery.INSTANCE.read(byteBuffer), byteBuffer.getInt());
            case 25:
                return new TypedReceipt.UploadProbed(FfiConverterTypeRefResolution.INSTANCE.read(byteBuffer), FfiConverterTypeUploadMode.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer));
            case 26:
                FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
                return new TypedReceipt.Downloaded(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), byteBuffer.getLong(), ffiConverterString2.read(byteBuffer));
            default:
                throw AbstractC7608F5v.A0l();
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(TypedReceipt typedReceipt, ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterString;
        String str;
        FfiConverterTypeDocumentKey ffiConverterTypeDocumentKey;
        DocumentKey documentKey;
        FillVerification fillVerification;
        FfiConverterOptionalString ffiConverterOptionalString;
        String str2;
        FfiConverterBoolean ffiConverterBoolean;
        boolean z;
        RefResolution refResolution;
        boolean zA1Y = C60P.A1Y(typedReceipt, byteBuffer);
        if (typedReceipt instanceof TypedReceipt.VisualProgram) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            TypedReceipt.VisualProgram visualProgram = (TypedReceipt.VisualProgram) typedReceipt;
            FfiConverterString.INSTANCE.write(visualProgram.resultJson, byteBuffer);
            FfiConverterOptionalString.INSTANCE.write(visualProgram.error, byteBuffer);
            byteBuffer.putLong(visualProgram.frames);
            byteBuffer.putLong(visualProgram.actions);
            FfiConverterOptionalTypeVisualProgramFeedback.INSTANCE.write(visualProgram.feedback, byteBuffer);
            return;
        }
        if (typedReceipt instanceof TypedReceipt.Observed) {
            byteBuffer.putInt(2);
            FfiConverterTypeObservation.INSTANCE.write(((TypedReceipt.Observed) typedReceipt).observation, byteBuffer);
            return;
        }
        if (typedReceipt instanceof TypedReceipt.Info) {
            byteBuffer.putInt(3);
            TypedReceipt.Info info = (TypedReceipt.Info) typedReceipt;
            FfiConverterTypePageMetadata.INSTANCE.write(info.metadata, byteBuffer);
            ffiConverterTypeDocumentKey = FfiConverterTypeDocumentKey.INSTANCE;
            documentKey = info.document;
        } else {
            if (!(typedReceipt instanceof TypedReceipt.PageRead)) {
                if (typedReceipt instanceof TypedReceipt.ElementRead) {
                    byteBuffer.putInt(5);
                    TypedReceipt.ElementRead elementRead = (TypedReceipt.ElementRead) typedReceipt;
                    FfiConverterTypeElementValue.INSTANCE.write(elementRead.value, byteBuffer);
                    refResolution = elementRead.resolution;
                } else {
                    if (!(typedReceipt instanceof TypedReceipt.ElementReads)) {
                        if (typedReceipt instanceof TypedReceipt.Wait) {
                            byteBuffer.putInt(7);
                            TypedReceipt.Wait wait = (TypedReceipt.Wait) typedReceipt;
                            FfiConverterBoolean.INSTANCE.write(wait.matched, byteBuffer);
                            FfiConverterOptionalTypeDocumentKey.INSTANCE.write(wait.document, byteBuffer);
                            return;
                        }
                        if (!(typedReceipt instanceof TypedReceipt.Action)) {
                            if (typedReceipt instanceof TypedReceipt.ActionRefused) {
                                byteBuffer.putInt(9);
                                FfiConverterTypeFailureContext.INSTANCE.write(((TypedReceipt.ActionRefused) typedReceipt).failureContext, byteBuffer);
                                return;
                            }
                            if (typedReceipt instanceof TypedReceipt.SelectRefused) {
                                byteBuffer.putInt(10);
                                FfiConverterSequenceString.INSTANCE.write(((TypedReceipt.SelectRefused) typedReceipt).options, byteBuffer);
                                return;
                            }
                            if (typedReceipt instanceof TypedReceipt.Focus) {
                                byteBuffer.putInt(11);
                                TypedReceipt.Focus focus = (TypedReceipt.Focus) typedReceipt;
                                AbstractC7611F5y.A0q(focus.resolution, byteBuffer);
                                ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
                                z = focus.focused;
                            } else {
                                if (typedReceipt instanceof TypedReceipt.Fill) {
                                    byteBuffer.putInt(12);
                                    TypedReceipt.Fill fill = (TypedReceipt.Fill) typedReceipt;
                                    AbstractC7611F5y.A0q(fill.resolution, byteBuffer);
                                    AbstractC7611F5y.A0q(fill.verification, byteBuffer);
                                    FfiConverterOptionalString.INSTANCE.write(fill.observedValue, byteBuffer);
                                    AbstractC7611F5y.A0q(fill.submit, byteBuffer);
                                    FfiConverterOptionalTypeTransitionEvidence.INSTANCE.write(fill.transition, byteBuffer);
                                    FfiConverterOptionalTypeFillDiagnostics.INSTANCE.write(fill.diagnostics, byteBuffer);
                                    return;
                                }
                                if (typedReceipt instanceof TypedReceipt.Select) {
                                    byteBuffer.putInt(13);
                                    TypedReceipt.Select select = (TypedReceipt.Select) typedReceipt;
                                    AbstractC7611F5y.A0q(select.resolution, byteBuffer);
                                    FfiConverterBoolean ffiConverterBoolean2 = FfiConverterBoolean.INSTANCE;
                                    ffiConverterBoolean2.write(select.selected, byteBuffer);
                                    ffiConverterBoolean2.write(select.changed, byteBuffer);
                                    ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                                    str2 = select.value;
                                } else if (typedReceipt instanceof TypedReceipt.SetChecked) {
                                    byteBuffer.putInt(14);
                                    TypedReceipt.SetChecked setChecked = (TypedReceipt.SetChecked) typedReceipt;
                                    AbstractC7611F5y.A0q(setChecked.resolution, byteBuffer);
                                    ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
                                    ffiConverterBoolean.write(setChecked.changed, byteBuffer);
                                    z = setChecked.checked;
                                } else {
                                    if (typedReceipt instanceof TypedReceipt.Scroll) {
                                        byteBuffer.putInt(15);
                                        FfiConverterOptionalTypeRefResolution.INSTANCE.write(((TypedReceipt.Scroll) typedReceipt).resolution, byteBuffer);
                                        return;
                                    }
                                    if (typedReceipt instanceof TypedReceipt.Navigation) {
                                        byteBuffer.putInt(16);
                                        FfiConverterTypeTransitionEvidence.INSTANCE.write(((TypedReceipt.Navigation) typedReceipt).transition, byteBuffer);
                                        return;
                                    }
                                    if (!(typedReceipt instanceof TypedReceipt.CredentialTarget)) {
                                        if (typedReceipt instanceof TypedReceipt.CredentialApplied) {
                                            byteBuffer.putInt(18);
                                            fillVerification = ((TypedReceipt.CredentialApplied) typedReceipt).verification;
                                        } else {
                                            if (!(typedReceipt instanceof TypedReceipt.CredentialCleared)) {
                                                if (typedReceipt instanceof TypedReceipt.ShopifyCheckout) {
                                                    byteBuffer.putInt(20);
                                                    ffiConverterString = FfiConverterString.INSTANCE;
                                                    TypedReceipt.ShopifyCheckout shopifyCheckout = (TypedReceipt.ShopifyCheckout) typedReceipt;
                                                    ffiConverterString.write(shopifyCheckout.serializedShop, byteBuffer);
                                                    FfiConverterTypeDocumentKey.INSTANCE.write(shopifyCheckout.document, byteBuffer);
                                                    str = shopifyCheckout.origin;
                                                } else if (typedReceipt instanceof TypedReceipt.ShopPayApproval) {
                                                    byteBuffer.putInt(21);
                                                    FfiConverterBoolean ffiConverterBoolean3 = FfiConverterBoolean.INSTANCE;
                                                    TypedReceipt.ShopPayApproval shopPayApproval = (TypedReceipt.ShopPayApproval) typedReceipt;
                                                    ffiConverterBoolean3.write(shopPayApproval.applied, byteBuffer);
                                                    ffiConverterBoolean3.write(shopPayApproval.alreadyApplied, byteBuffer);
                                                    ffiConverterTypeDocumentKey = FfiConverterTypeDocumentKey.INSTANCE;
                                                    documentKey = shopPayApproval.document;
                                                } else {
                                                    if (typedReceipt instanceof TypedReceipt.Captured) {
                                                        byteBuffer.putInt(22);
                                                        TypedReceipt.Captured captured = (TypedReceipt.Captured) typedReceipt;
                                                        FfiConverterTypeProtectedImage.INSTANCE.write(captured.image, byteBuffer);
                                                        FfiConverterTypeDocumentKey.INSTANCE.write(captured.document, byteBuffer);
                                                        FfiConverterTypeCoordinateScope.INSTANCE.write(captured.scope, byteBuffer);
                                                        FfiConverterTypeViewport.INSTANCE.write(captured.viewport, byteBuffer);
                                                        FfiConverterBoolean.INSTANCE.write(captured.redactionsPresent, byteBuffer);
                                                        FfiConverterTypeCaptureCrop.INSTANCE.write(captured.region, byteBuffer);
                                                        FfiConverterOptionalTypeChallengeProof.INSTANCE.write(captured.challengeProof, byteBuffer);
                                                        FfiConverterOptionalTypePageImageLoads.INSTANCE.write(captured.imageLoads, byteBuffer);
                                                        return;
                                                    }
                                                    if (typedReceipt instanceof TypedReceipt.Pdf) {
                                                        byteBuffer.putInt(23);
                                                        TypedReceipt.Pdf pdf = (TypedReceipt.Pdf) typedReceipt;
                                                        FfiConverterString.INSTANCE.write(pdf.base64, byteBuffer);
                                                        ffiConverterTypeDocumentKey = FfiConverterTypeDocumentKey.INSTANCE;
                                                        documentKey = pdf.document;
                                                    } else {
                                                        if (typedReceipt instanceof TypedReceipt.Uploaded) {
                                                            byteBuffer.putInt(24);
                                                            TypedReceipt.Uploaded uploaded = (TypedReceipt.Uploaded) typedReceipt;
                                                            AbstractC7611F5y.A0q(uploaded.resolution, byteBuffer);
                                                            AbstractC7611F5y.A0q(uploaded.mode, byteBuffer);
                                                            AbstractC7611F5y.A0q(uploaded.delivery, byteBuffer);
                                                            byteBuffer.putInt(uploaded.files);
                                                            return;
                                                        }
                                                        if (typedReceipt instanceof TypedReceipt.UploadProbed) {
                                                            byteBuffer.putInt(25);
                                                            TypedReceipt.UploadProbed uploadProbed = (TypedReceipt.UploadProbed) typedReceipt;
                                                            AbstractC7611F5y.A0q(uploadProbed.resolution, byteBuffer);
                                                            AbstractC7611F5y.A0q(uploadProbed.mode, byteBuffer);
                                                            FfiConverterString.INSTANCE.write(uploadProbed.origin, byteBuffer);
                                                            FfiConverterOptionalBoolean.INSTANCE.write(uploadProbed.multiple, byteBuffer);
                                                            return;
                                                        }
                                                        if (!(typedReceipt instanceof TypedReceipt.Downloaded)) {
                                                            throw C3cG.A0q();
                                                        }
                                                        byteBuffer.putInt(26);
                                                        FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
                                                        TypedReceipt.Downloaded downloaded = (TypedReceipt.Downloaded) typedReceipt;
                                                        ffiConverterString2.write(downloaded.destination, byteBuffer);
                                                        ffiConverterString2.write(downloaded.name, byteBuffer);
                                                        FfiConverterOptionalString.INSTANCE.write(downloaded.mimeType, byteBuffer);
                                                        byteBuffer.putLong(downloaded.bytes);
                                                        ffiConverterString = FfiConverterString.INSTANCE;
                                                        str = downloaded.sha256;
                                                    }
                                                }
                                                ffiConverterString.write(str, byteBuffer);
                                                return;
                                            }
                                            byteBuffer.putInt(19);
                                            fillVerification = ((TypedReceipt.CredentialCleared) typedReceipt).verification;
                                        }
                                        AbstractC7611F5y.A0q(fillVerification, byteBuffer);
                                        return;
                                    }
                                    byteBuffer.putInt(17);
                                    TypedReceipt.CredentialTarget credentialTarget = (TypedReceipt.CredentialTarget) typedReceipt;
                                    FfiConverterTypeCredentialProof.INSTANCE.write(credentialTarget.proof, byteBuffer);
                                    FfiConverterOptionalString.INSTANCE.write(credentialTarget.targetIdentity, byteBuffer);
                                    FfiConverterSequenceTypeCredentialFieldKind.INSTANCE.write((List<? extends CredentialFieldKind>) credentialTarget.permittedFields, byteBuffer);
                                    FfiConverterTypeDocumentKey.INSTANCE.write(credentialTarget.document, byteBuffer);
                                    ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                                    str2 = credentialTarget.fillKey;
                                }
                            }
                            ffiConverterBoolean.write(z, byteBuffer);
                            return;
                        }
                        byteBuffer.putInt(8);
                        TypedReceipt.Action action = (TypedReceipt.Action) typedReceipt;
                        FfiConverterOptionalTypeRefResolution.INSTANCE.write(action.resolution, byteBuffer);
                        FfiConverterTypeTransitionEvidence.INSTANCE.write(action.transition, byteBuffer);
                        ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                        str2 = action.obscuredBy;
                        ffiConverterOptionalString.write(str2, byteBuffer);
                        return;
                    }
                    byteBuffer.putInt(6);
                    TypedReceipt.ElementReads elementReads = (TypedReceipt.ElementReads) typedReceipt;
                    FfiConverterSequenceTypeElementValue.INSTANCE.write((List<? extends ElementValue>) elementReads.values, byteBuffer);
                    refResolution = elementReads.resolution;
                }
                AbstractC7611F5y.A0q(refResolution, byteBuffer);
                return;
            }
            byteBuffer.putInt(4);
            TypedReceipt.PageRead pageRead = (TypedReceipt.PageRead) typedReceipt;
            AbstractC7611F5y.A0q(pageRead.read, byteBuffer);
            FfiConverterString.INSTANCE.write(pageRead.text, byteBuffer);
            ffiConverterTypeDocumentKey = FfiConverterTypeDocumentKey.INSTANCE;
            documentKey = pageRead.document;
        }
        ffiConverterTypeDocumentKey.write(documentKey, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.TypedReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ TypedReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
