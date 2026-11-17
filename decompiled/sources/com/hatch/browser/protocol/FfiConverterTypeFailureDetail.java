package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FailureDetail;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FfiConverterTypeFailureDetail implements FfiConverterRustBuffer<FailureDetail> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFailureDetail INSTANCE = new FfiConverterTypeFailureDetail();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(FailureDetail failureDetail) {
        C7384Etj.A0Y(failureDetail, 0);
        if (!(failureDetail instanceof FailureDetail.UnknownPageReference) && !(failureDetail instanceof FailureDetail.WrongTask) && !(failureDetail instanceof FailureDetail.RemovedPage) && !(failureDetail instanceof FailureDetail.AuthorityChanged) && !(failureDetail instanceof FailureDetail.ControlUnavailable) && !(failureDetail instanceof FailureDetail.ProtectedWorkPending) && !(failureDetail instanceof FailureDetail.DuplicateOperation) && !(failureDetail instanceof FailureDetail.CapacityExceeded) && !(failureDetail instanceof FailureDetail.InvalidArgument) && !(failureDetail instanceof FailureDetail.Expired) && !(failureDetail instanceof FailureDetail.InvalidScope) && !(failureDetail instanceof FailureDetail.DocumentChanged) && !(failureDetail instanceof FailureDetail.RouteUnavailable) && !(failureDetail instanceof FailureDetail.RendererUnresponsive) && !(failureDetail instanceof FailureDetail.AttachmentChanged) && !(failureDetail instanceof FailureDetail.NativeRefusal) && !(failureDetail instanceof FailureDetail.TargetNotNativeSelect) && !(failureDetail instanceof FailureDetail.SelectDisabled) && !(failureDetail instanceof FailureDetail.OptionNotFound) && !(failureDetail instanceof FailureDetail.OptionDisabled) && !(failureDetail instanceof FailureDetail.OptionAmbiguous) && !(failureDetail instanceof FailureDetail.NativeSelectHidden)) {
            if (failureDetail instanceof FailureDetail.InputNotStarted) {
                FailureDetail.InputNotStarted inputNotStarted = (FailureDetail.InputNotStarted) failureDetail;
                return AbstractC7609F5w.A0M(AbstractC7610F5x.A0W(inputNotStarted.reason), 4L) + AbstractC7610F5x.A0W(inputNotStarted.visibility);
            }
            if (!(failureDetail instanceof FailureDetail.PolicyDenied) && !(failureDetail instanceof FailureDetail.ContinuationUnavailable) && !(failureDetail instanceof FailureDetail.ProofUnavailable) && !(failureDetail instanceof FailureDetail.OriginChanged) && !(failureDetail instanceof FailureDetail.NoMatch) && !(failureDetail instanceof FailureDetail.AmbiguousMatch) && !(failureDetail instanceof FailureDetail.CredentialTargetChanged) && !(failureDetail instanceof FailureDetail.CheckoutUnavailable) && !(failureDetail instanceof FailureDetail.UnsupportedCommand) && !(failureDetail instanceof FailureDetail.RequiredOutputUnavailable) && !(failureDetail instanceof FailureDetail.CoreClosed) && !(failureDetail instanceof FailureDetail.InvalidReport) && !(failureDetail instanceof FailureDetail.PasteIntoPasswordField)) {
                if (failureDetail instanceof FailureDetail.HostCapabilityMissing) {
                    return 8L;
                }
                if (!(failureDetail instanceof FailureDetail.FileAccessUnavailable) && !(failureDetail instanceof FailureDetail.FileUnavailable) && !(failureDetail instanceof FailureDetail.FileChanged) && !(failureDetail instanceof FailureDetail.UploadPickerUnsupported)) {
                    if ((failureDetail instanceof FailureDetail.DownloadNotStarted) || (failureDetail instanceof FailureDetail.DownloadUnreadable)) {
                        return 8L;
                    }
                    if (!(failureDetail instanceof FailureDetail.DownloadInterrupted) && !(failureDetail instanceof FailureDetail.PublishMismatch) && !(failureDetail instanceof FailureDetail.PointerNotHeld)) {
                        throw C3cG.A0q();
                    }
                }
            }
        }
        return 4L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ FailureDetail lift(RustBuffer.ByValue byValue) {
        return (FailureDetail) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ FailureDetail liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (FailureDetail) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(FailureDetail failureDetail) {
        return lower((Object) failureDetail);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(FailureDetail failureDetail) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, failureDetail);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public FailureDetail read(ByteBuffer byteBuffer) {
        switch (AbstractC7609F5w.A0H(byteBuffer)) {
            case 1:
                return FailureDetail.UnknownPageReference.INSTANCE;
            case 2:
                return FailureDetail.WrongTask.INSTANCE;
            case 3:
                return FailureDetail.RemovedPage.INSTANCE;
            case 4:
                return FailureDetail.AuthorityChanged.INSTANCE;
            case 5:
                return FailureDetail.ControlUnavailable.INSTANCE;
            case 6:
                return FailureDetail.ProtectedWorkPending.INSTANCE;
            case 7:
                return FailureDetail.DuplicateOperation.INSTANCE;
            case 8:
                return FailureDetail.CapacityExceeded.INSTANCE;
            case 9:
                return FailureDetail.InvalidArgument.INSTANCE;
            case 10:
                return FailureDetail.Expired.INSTANCE;
            case 11:
                return FailureDetail.InvalidScope.INSTANCE;
            case 12:
                return FailureDetail.DocumentChanged.INSTANCE;
            case 13:
                return FailureDetail.RouteUnavailable.INSTANCE;
            case 14:
                return FailureDetail.RendererUnresponsive.INSTANCE;
            case 15:
                return FailureDetail.AttachmentChanged.INSTANCE;
            case 16:
                return FailureDetail.NativeRefusal.INSTANCE;
            case 17:
                return FailureDetail.TargetNotNativeSelect.INSTANCE;
            case 18:
                return FailureDetail.SelectDisabled.INSTANCE;
            case 19:
                return FailureDetail.OptionNotFound.INSTANCE;
            case 20:
                return FailureDetail.OptionDisabled.INSTANCE;
            case 21:
                return FailureDetail.OptionAmbiguous.INSTANCE;
            case 22:
                return FailureDetail.NativeSelectHidden.INSTANCE;
            case 23:
                return new FailureDetail.InputNotStarted(FfiConverterOptionalTypeInputRefusalReason.INSTANCE.read(byteBuffer), FfiConverterTypeInputRefusalResolution.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeInputVisibilityReason.INSTANCE.read(byteBuffer));
            case 24:
                return FailureDetail.PolicyDenied.INSTANCE;
            case 25:
                return FailureDetail.ContinuationUnavailable.INSTANCE;
            case 26:
                return FailureDetail.ProofUnavailable.INSTANCE;
            case 27:
                return FailureDetail.OriginChanged.INSTANCE;
            case 28:
                return FailureDetail.NoMatch.INSTANCE;
            case 29:
                return FailureDetail.AmbiguousMatch.INSTANCE;
            case 30:
                return FailureDetail.CredentialTargetChanged.INSTANCE;
            case 31:
                return FailureDetail.CheckoutUnavailable.INSTANCE;
            case 32:
                return FailureDetail.UnsupportedCommand.INSTANCE;
            case 33:
                return FailureDetail.RequiredOutputUnavailable.INSTANCE;
            case 34:
                return FailureDetail.CoreClosed.INSTANCE;
            case 35:
                return FailureDetail.InvalidReport.INSTANCE;
            case 36:
                return FailureDetail.PasteIntoPasswordField.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return new FailureDetail.HostCapabilityMissing(FfiConverterTypeHostCapability.INSTANCE.read(byteBuffer));
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return FailureDetail.FileAccessUnavailable.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return FailureDetail.FileUnavailable.INSTANCE;
            case 40:
                return FailureDetail.FileChanged.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return FailureDetail.UploadPickerUnsupported.INSTANCE;
            case 42:
                return new FailureDetail.DownloadNotStarted(FfiConverterTypeDownloadNotStartedReason.INSTANCE.read(byteBuffer));
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return new FailureDetail.DownloadUnreadable(FfiConverterTypeDownloadUnreadableReason.INSTANCE.read(byteBuffer));
            case 44:
                return FailureDetail.DownloadInterrupted.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return FailureDetail.PublishMismatch.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return FailureDetail.PointerNotHeld.INSTANCE;
            default:
                throw AbstractC7608F5v.A0l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(FailureDetail failureDetail, ByteBuffer byteBuffer) {
        boolean z = failureDetail instanceof FailureDetail.UnknownPageReference;
        int iA1Y = C60P.A1Y(failureDetail, byteBuffer);
        if (!z) {
            if (failureDetail instanceof FailureDetail.WrongTask) {
                iA1Y = 2;
            } else if (failureDetail instanceof FailureDetail.RemovedPage) {
                iA1Y = 3;
            } else if (failureDetail instanceof FailureDetail.AuthorityChanged) {
                iA1Y = 4;
            } else if (failureDetail instanceof FailureDetail.ControlUnavailable) {
                iA1Y = 5;
            } else if (failureDetail instanceof FailureDetail.ProtectedWorkPending) {
                iA1Y = 6;
            } else if (failureDetail instanceof FailureDetail.DuplicateOperation) {
                iA1Y = 7;
            } else if (failureDetail instanceof FailureDetail.CapacityExceeded) {
                iA1Y = 8;
            } else if (failureDetail instanceof FailureDetail.InvalidArgument) {
                iA1Y = 9;
            } else if (failureDetail instanceof FailureDetail.Expired) {
                iA1Y = 10;
            } else if (failureDetail instanceof FailureDetail.InvalidScope) {
                iA1Y = 11;
            } else if (failureDetail instanceof FailureDetail.DocumentChanged) {
                iA1Y = 12;
            } else if (failureDetail instanceof FailureDetail.RouteUnavailable) {
                iA1Y = 13;
            } else if (failureDetail instanceof FailureDetail.RendererUnresponsive) {
                iA1Y = 14;
            } else if (failureDetail instanceof FailureDetail.AttachmentChanged) {
                iA1Y = 15;
            } else if (failureDetail instanceof FailureDetail.NativeRefusal) {
                iA1Y = 16;
            } else if (failureDetail instanceof FailureDetail.TargetNotNativeSelect) {
                iA1Y = 17;
            } else if (failureDetail instanceof FailureDetail.SelectDisabled) {
                iA1Y = 18;
            } else if (failureDetail instanceof FailureDetail.OptionNotFound) {
                iA1Y = 19;
            } else if (failureDetail instanceof FailureDetail.OptionDisabled) {
                iA1Y = 20;
            } else if (failureDetail instanceof FailureDetail.OptionAmbiguous) {
                iA1Y = 21;
            } else if (failureDetail instanceof FailureDetail.NativeSelectHidden) {
                iA1Y = 22;
            } else {
                if (failureDetail instanceof FailureDetail.InputNotStarted) {
                    byteBuffer.putInt(23);
                    FailureDetail.InputNotStarted inputNotStarted = (FailureDetail.InputNotStarted) failureDetail;
                    FfiConverterOptionalTypeInputRefusalReason.INSTANCE.write(inputNotStarted.reason, byteBuffer);
                    AbstractC7611F5y.A0q(inputNotStarted.resolution, byteBuffer);
                    FfiConverterOptionalTypeInputVisibilityReason.INSTANCE.write(inputNotStarted.visibility, byteBuffer);
                    return;
                }
                if (failureDetail instanceof FailureDetail.PolicyDenied) {
                    iA1Y = 24;
                } else if (failureDetail instanceof FailureDetail.ContinuationUnavailable) {
                    iA1Y = 25;
                } else if (failureDetail instanceof FailureDetail.ProofUnavailable) {
                    iA1Y = 26;
                } else if (failureDetail instanceof FailureDetail.OriginChanged) {
                    iA1Y = 27;
                } else if (failureDetail instanceof FailureDetail.NoMatch) {
                    iA1Y = 28;
                } else if (failureDetail instanceof FailureDetail.AmbiguousMatch) {
                    iA1Y = 29;
                } else if (failureDetail instanceof FailureDetail.CredentialTargetChanged) {
                    iA1Y = 30;
                } else if (failureDetail instanceof FailureDetail.CheckoutUnavailable) {
                    iA1Y = 31;
                } else if (failureDetail instanceof FailureDetail.UnsupportedCommand) {
                    iA1Y = 32;
                } else if (failureDetail instanceof FailureDetail.RequiredOutputUnavailable) {
                    iA1Y = 33;
                } else if (failureDetail instanceof FailureDetail.CoreClosed) {
                    iA1Y = 34;
                } else if (failureDetail instanceof FailureDetail.InvalidReport) {
                    iA1Y = 35;
                } else if (failureDetail instanceof FailureDetail.PasteIntoPasswordField) {
                    iA1Y = 36;
                } else {
                    if (failureDetail instanceof FailureDetail.HostCapabilityMissing) {
                        byteBuffer.putInt(37);
                        AbstractC7611F5y.A0q(((FailureDetail.HostCapabilityMissing) failureDetail).capability, byteBuffer);
                        return;
                    }
                    if (failureDetail instanceof FailureDetail.FileAccessUnavailable) {
                        iA1Y = 38;
                    } else if (failureDetail instanceof FailureDetail.FileUnavailable) {
                        iA1Y = 39;
                    } else if (failureDetail instanceof FailureDetail.FileChanged) {
                        iA1Y = 40;
                    } else if (failureDetail instanceof FailureDetail.UploadPickerUnsupported) {
                        iA1Y = 41;
                    } else if (failureDetail instanceof FailureDetail.DownloadNotStarted) {
                        byteBuffer.putInt(42);
                        AbstractC7611F5y.A0q(((FailureDetail.DownloadNotStarted) failureDetail).reason, byteBuffer);
                        return;
                    } else if (failureDetail instanceof FailureDetail.DownloadUnreadable) {
                        byteBuffer.putInt(43);
                        AbstractC7611F5y.A0q(((FailureDetail.DownloadUnreadable) failureDetail).reason, byteBuffer);
                        return;
                    } else if (failureDetail instanceof FailureDetail.DownloadInterrupted) {
                        iA1Y = 44;
                    } else if (failureDetail instanceof FailureDetail.PublishMismatch) {
                        iA1Y = 45;
                    } else {
                        if (!(failureDetail instanceof FailureDetail.PointerNotHeld)) {
                            throw C3cG.A0q();
                        }
                        iA1Y = 46;
                    }
                }
            }
        }
        byteBuffer.putInt(iA1Y);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.FailureDetail, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FailureDetail lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
