package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.WorkSource;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.authlite.api.store.UserSessionCookie;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzek;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_label.zzj;
import com.google.android.gms.internal.mlkit_vision_label.zzod;
import com.google.android.gms.internal.mlkit_vision_label.zzoj;
import com.google.android.gms.internal.mlkit_vision_label.zzol;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzal;
import com.google.android.gms.signin.internal.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.maplibre.android.R;

/* renamed from: X.CoD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4158CoD implements Parcelable.Creator {
    public final int $t;

    public static float A00(Parcel parcel, int i) {
        AbstractC4159CoF.A0F(parcel, i, 4);
        return parcel.readFloat();
    }

    public C4158CoD(int i) {
        this.$t = i;
    }

    public static C4158CoD A03(int i) {
        return new C4158CoD(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws ErrorCode.UnsupportedErrorCodeException, Transport.UnsupportedTransportException {
        int iA03;
        int iDataPosition;
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(parcel, 0);
                return new StickyItemsLinearLayoutManager.SavedState(parcel);
            case 1:
                C7384Etj.A0Y(parcel, 0);
                return new UserSessionCookie(parcel.readInt() != 0 ? Boolean.valueOf(AnonymousClass002.A1L(parcel.readInt())) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new ColorData(parcel.readInt() == 0 ? null : DspSpectrumRef.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DspSpectrumRef.CREATOR.createFromParcel(parcel) : null, C7384Etj.A03(parcel), parcel.readInt());
            case 3:
                C7384Etj.A0Y(parcel, 0);
                return new DspSpectrumRef(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt());
            case 4:
                C7384Etj.A0Y(parcel, 0);
                return ZonePolicy.valueOf(parcel.readString());
            case 5:
                C7384Etj.A0Y(parcel, 0);
                C9sU c9sU = PushInfraMetaData.A0I;
                return new PushInfraMetaData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                int iA00 = AbstractC4159CoF.A00(parcel);
                BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
                BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
                String strA09 = null;
                BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
                BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
                boolean zA1L = false;
                int iA02 = 0;
                boolean zA1L2 = false;
                while (parcel.dataPosition() < iA00) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) AbstractC4159CoF.A08(parcel, BeginSignInRequest.PasswordRequestOptions.CREATOR, i);
                            break;
                        case 2:
                            googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) AbstractC4159CoF.A08(parcel, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR, i);
                            break;
                        case 3:
                            strA09 = AbstractC4159CoF.A09(parcel, i);
                            break;
                        case 4:
                            zA1L = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i));
                            break;
                        case 5:
                            iA02 = AbstractC4159CoF.A02(parcel, i);
                            break;
                        case 6:
                            passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) AbstractC4159CoF.A08(parcel, BeginSignInRequest.PasskeysRequestOptions.CREATOR, i);
                            break;
                        case 7:
                            passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) AbstractC4159CoF.A08(parcel, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR, i);
                            break;
                        case '\b':
                            zA1L2 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i));
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA00);
                return new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, strA09, iA02, zA1L, zA1L2);
            case 7:
                int iA002 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntentA01 = null;
                while (parcel.dataPosition() < iA002) {
                    pendingIntentA01 = A01(pendingIntentA01, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA002);
                return new BeginSignInResult(pendingIntentA01);
            case 8:
                int iA003 = AbstractC4159CoF.A00(parcel);
                String strA092 = null;
                String strA093 = null;
                String strA094 = null;
                String strA095 = null;
                boolean zA1L3 = false;
                int iA022 = 0;
                while (parcel.dataPosition() < iA003) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            strA092 = AbstractC4159CoF.A09(parcel, i2);
                            break;
                        case 2:
                            strA093 = AbstractC4159CoF.A09(parcel, i2);
                            break;
                        case 3:
                            strA094 = AbstractC4159CoF.A09(parcel, i2);
                            break;
                        case 4:
                            strA095 = AbstractC4159CoF.A09(parcel, i2);
                            break;
                        case 5:
                            zA1L3 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i2));
                            break;
                        case 6:
                            iA022 = AbstractC4159CoF.A02(parcel, i2);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i2);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA003);
                return new GetSignInIntentRequest(strA092, iA022, strA093, strA094, strA095, zA1L3);
            case 9:
                int iA004 = AbstractC4159CoF.A00(parcel);
                String strA096 = null;
                String strA097 = null;
                String strA098 = null;
                ArrayList<String> arrayListA0B = null;
                boolean zA1L4 = false;
                boolean zA1L5 = false;
                boolean zA1L6 = false;
                while (parcel.dataPosition() < iA004) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            zA1L4 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i3));
                            break;
                        case 2:
                            strA096 = AbstractC4159CoF.A09(parcel, i3);
                            break;
                        case 3:
                            strA097 = AbstractC4159CoF.A09(parcel, i3);
                            break;
                        case 4:
                            zA1L5 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i3));
                            break;
                        case 5:
                            strA098 = AbstractC4159CoF.A09(parcel, i3);
                            break;
                        case 6:
                            arrayListA0B = AbstractC4159CoF.A0B(parcel, i3);
                            break;
                        case 7:
                            zA1L6 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i3));
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i3);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA004);
                return new BeginSignInRequest.GoogleIdTokenRequestOptions(strA096, arrayListA0B, strA097, strA098, zA1L4, zA1L5, zA1L6);
            case 10:
                int iA005 = AbstractC4159CoF.A00(parcel);
                String strA0A = null;
                boolean zA1L7 = false;
                while (parcel.dataPosition() < iA005) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c != 1) {
                        strA0A = AbstractC4159CoF.A0A(parcel, strA0A, c, 2, i4);
                    } else {
                        zA1L7 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i4));
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA005);
                return new BeginSignInRequest.PasskeyJsonRequestOptions(zA1L7, strA0A);
            case 11:
                int iA006 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I = null;
                String strA0A2 = null;
                boolean zA1L8 = false;
                while (parcel.dataPosition() < iA006) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        zA1L8 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i5));
                    } else if (c2 != 2) {
                        strA0A2 = AbstractC4159CoF.A0A(parcel, strA0A2, c2, 3, i5);
                    } else {
                        bArrA0I = AbstractC4159CoF.A0I(parcel, i5);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA006);
                return new BeginSignInRequest.PasskeysRequestOptions(strA0A2, bArrA0I, zA1L8);
            case 12:
                int iA007 = AbstractC4159CoF.A00(parcel);
                boolean zA0H = false;
                while (parcel.dataPosition() < iA007) {
                    int i6 = parcel.readInt();
                    zA0H = AbstractC4159CoF.A0H(parcel, (char) i6, 1, i6, zA0H);
                }
                AbstractC4159CoF.A0D(parcel, iA007);
                return new BeginSignInRequest.PasswordRequestOptions(zA0H);
            case 13:
                int iA008 = AbstractC4159CoF.A00(parcel);
                String strA099 = null;
                String strA0910 = null;
                String strA0911 = null;
                String strA0912 = null;
                Uri uri = null;
                String strA0913 = null;
                String strA0914 = null;
                String strA0915 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < iA008) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            strA099 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case 2:
                            strA0910 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case 3:
                            strA0911 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case 4:
                            strA0912 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case 5:
                            uri = (Uri) AbstractC4159CoF.A08(parcel, Uri.CREATOR, i7);
                            break;
                        case 6:
                            strA0913 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case 7:
                            strA0914 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case '\b':
                            strA0915 = AbstractC4159CoF.A09(parcel, i7);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) AbstractC4159CoF.A08(parcel, PublicKeyCredential.CREATOR, i7);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i7);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA008);
                return new SignInCredential(uri, publicKeyCredential, strA099, strA0910, strA0911, strA0912, strA0913, strA0914, strA0915);
            case 14:
                int iA009 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA06 = null;
                int iA023 = 0;
                int iA024 = 0;
                while (parcel.dataPosition() < iA009) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iA023 = AbstractC4159CoF.A02(parcel, i8);
                    } else if (c3 == 2) {
                        iA024 = AbstractC4159CoF.A02(parcel, i8);
                    } else if (c3 != 3) {
                        AbstractC4159CoF.A0E(parcel, i8);
                    } else {
                        bundleA06 = AbstractC4159CoF.A06(parcel, i8);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA009);
                return new GoogleSignInOptionsExtensionParcelable(bundleA06, iA023, iA024);
            case 15:
                int iA0010 = AbstractC4159CoF.A00(parcel);
                String strA0916 = null;
                String strA0917 = null;
                String strA0918 = null;
                String strA0919 = null;
                Uri uri2 = null;
                String strA0920 = null;
                String strA0921 = null;
                ArrayList arrayListA0C = null;
                String strA0922 = null;
                String strA0923 = null;
                long jA05 = 0;
                int iA025 = 0;
                while (parcel.dataPosition() < iA0010) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iA025 = AbstractC4159CoF.A02(parcel, i9);
                            break;
                        case 2:
                            strA0916 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case 3:
                            strA0917 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case 4:
                            strA0918 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case 5:
                            strA0919 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case 6:
                            uri2 = (Uri) AbstractC4159CoF.A08(parcel, Uri.CREATOR, i9);
                            break;
                        case 7:
                            strA0920 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case '\b':
                            jA05 = AbstractC4159CoF.A05(parcel, i9);
                            break;
                        case '\t':
                            strA0921 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case '\n':
                            arrayListA0C = AbstractC4159CoF.A0C(parcel, Scope.CREATOR, i9);
                            break;
                        case 11:
                            strA0922 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        case '\f':
                            strA0923 = AbstractC4159CoF.A09(parcel, i9);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i9);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0010);
                return new GoogleSignInAccount(uri2, strA0916, strA0917, strA0918, strA0919, strA0920, strA0921, strA0922, strA0923, arrayListA0C, iA025, jA05);
            case 16:
                int iA0011 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C2 = null;
                Account account = null;
                String strA0924 = null;
                String strA0925 = null;
                ArrayList arrayListA0C3 = null;
                String strA0926 = null;
                int iA026 = 0;
                boolean zA1L9 = false;
                boolean zA1L10 = false;
                boolean zA1L11 = false;
                while (parcel.dataPosition() < iA0011) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iA026 = AbstractC4159CoF.A02(parcel, i10);
                            break;
                        case 2:
                            arrayListA0C2 = AbstractC4159CoF.A0C(parcel, Scope.CREATOR, i10);
                            break;
                        case 3:
                            account = (Account) AbstractC4159CoF.A08(parcel, Account.CREATOR, i10);
                            break;
                        case 4:
                            zA1L9 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i10));
                            break;
                        case 5:
                            zA1L10 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i10));
                            break;
                        case 6:
                            zA1L11 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i10));
                            break;
                        case 7:
                            strA0924 = AbstractC4159CoF.A09(parcel, i10);
                            break;
                        case '\b':
                            strA0925 = AbstractC4159CoF.A09(parcel, i10);
                            break;
                        case '\t':
                            arrayListA0C3 = AbstractC4159CoF.A0C(parcel, GoogleSignInOptionsExtensionParcelable.CREATOR, i10);
                            break;
                        case '\n':
                            strA0926 = AbstractC4159CoF.A09(parcel, i10);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i10);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0011);
                Parcelable.Creator<GoogleSignInOptions> creator = GoogleSignInOptions.CREATOR;
                HashMap mapA0u = BV4.A0u();
                if (arrayListA0C3 != null) {
                    Iterator it = arrayListA0C3.iterator();
                    while (it.hasNext()) {
                        GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                        BV6.A1E(googleSignInOptionsExtensionParcelable, mapA0u, googleSignInOptionsExtensionParcelable.A00);
                    }
                }
                return new GoogleSignInOptions(account, strA0924, strA0925, strA0926, arrayListA0C2, mapA0u, iA026, zA1L9, zA1L10, zA1L11);
            case 17:
                int iA0012 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA02 = null;
                while (parcel.dataPosition() < iA0012) {
                    bundleA02 = A02(bundleA02, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0012);
                return new ClearRestoreCredentialRequest(bundleA02);
            case 18:
                int iA0013 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA022 = null;
                while (parcel.dataPosition() < iA0013) {
                    bundleA022 = A02(bundleA022, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0013);
                return new GetRestoreCredentialRequest(bundleA022);
            case 19:
                return A04(parcel);
            case 20:
                int iA0014 = AbstractC4159CoF.A00(parcel);
                int iA027 = 0;
                int iA028 = 0;
                int iA029 = 0;
                boolean zA0H2 = true;
                while (parcel.dataPosition() < iA0014) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        iA027 = AbstractC4159CoF.A02(parcel, i11);
                    } else if (c4 == 2) {
                        iA028 = AbstractC4159CoF.A02(parcel, i11);
                    } else if (c4 != 3) {
                        zA0H2 = AbstractC4159CoF.A0H(parcel, c4, 4, i11, zA0H2);
                    } else {
                        iA029 = AbstractC4159CoF.A02(parcel, i11);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0014);
                return new ComplianceOptions(iA027, iA028, iA029, zA0H2);
            case 21:
                int iA0015 = AbstractC4159CoF.A00(parcel);
                String strA0A3 = null;
                int iA0210 = 0;
                while (parcel.dataPosition() < iA0015) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 != 1) {
                        strA0A3 = AbstractC4159CoF.A0A(parcel, strA0A3, c5, 2, i12);
                    } else {
                        iA0210 = AbstractC4159CoF.A02(parcel, i12);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0015);
                return new Scope(iA0210, strA0A3);
            case 22:
                int iA0016 = AbstractC4159CoF.A00(parcel);
                String strA0927 = null;
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                int iA0211 = 0;
                while (parcel.dataPosition() < iA0016) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iA0211 = AbstractC4159CoF.A02(parcel, i13);
                    } else if (c6 == 2) {
                        strA0927 = AbstractC4159CoF.A09(parcel, i13);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i13);
                    } else if (c6 != 4) {
                        AbstractC4159CoF.A0E(parcel, i13);
                    } else {
                        connectionResult = (ConnectionResult) AbstractC4159CoF.A08(parcel, ConnectionResult.CREATOR, i13);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0016);
                return new Status(pendingIntent, connectionResult, strA0927, iA0211);
            case 23:
                int iA0017 = AbstractC4159CoF.A00(parcel);
                String[] strArrCreateStringArray = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleA062 = null;
                int iA04 = 0;
                int iA0212 = 0;
                while (parcel.dataPosition() < iA0017) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        int iA032 = AbstractC4159CoF.A03(parcel, i14);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iA032 == 0) {
                            strArrCreateStringArray = null;
                        } else {
                            strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition2 + iA032);
                        }
                    } else if (c7 == 2) {
                        cursorWindowArr = (CursorWindow[]) AbstractC4159CoF.A0J(parcel, CursorWindow.CREATOR, i14);
                    } else if (c7 == 3) {
                        iA0212 = AbstractC4159CoF.A02(parcel, i14);
                    } else if (c7 != 4) {
                        iA04 = AbstractC4159CoF.A04(parcel, c7, 1000, i14, iA04);
                    } else {
                        bundleA062 = AbstractC4159CoF.A06(parcel, i14);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0017);
                DataHolder dataHolder = new DataHolder(bundleA062, cursorWindowArr, strArrCreateStringArray, iA04, iA0212);
                dataHolder.A01 = BV6.A0N();
                int i15 = 0;
                while (true) {
                    String[] strArr = dataHolder.A08;
                    if (i15 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.A07;
                        int length = cursorWindowArr2.length;
                        dataHolder.A03 = new int[length];
                        int numRows = 0;
                        for (int i16 = 0; i16 < length; i16++) {
                            dataHolder.A03[i16] = numRows;
                            numRows += cursorWindowArr2[i16].getNumRows() - (numRows - cursorWindowArr2[i16].getStartPosition());
                        }
                        dataHolder.A00 = numRows;
                        return dataHolder;
                    }
                    dataHolder.A01.putInt(strArr[i15], i15);
                    i15++;
                }
            case 24:
                int iA0018 = AbstractC4159CoF.A00(parcel);
                String strA0A4 = null;
                int iA0213 = 0;
                while (parcel.dataPosition() < iA0018) {
                    int i17 = parcel.readInt();
                    char c8 = (char) i17;
                    if (c8 != 1) {
                        strA0A4 = AbstractC4159CoF.A0A(parcel, strA0A4, c8, 2, i17);
                    } else {
                        iA0213 = AbstractC4159CoF.A02(parcel, i17);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0018);
                return new ClientIdentity(iA0213, strA0A4);
            case 25:
                int iA0019 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C4 = null;
                int iA0214 = 0;
                while (parcel.dataPosition() < iA0019) {
                    int i18 = parcel.readInt();
                    char c9 = (char) i18;
                    if (c9 == 1) {
                        iA0214 = AbstractC4159CoF.A02(parcel, i18);
                    } else if (c9 != 2) {
                        AbstractC4159CoF.A0E(parcel, i18);
                    } else {
                        arrayListA0C4 = AbstractC4159CoF.A0C(parcel, MethodInvocation.CREATOR, i18);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0019);
                return new TelemetryData(iA0214, arrayListA0C4);
            case 26:
                int iA0020 = AbstractC4159CoF.A00(parcel);
                String strA0928 = null;
                String strA0929 = null;
                long jA052 = 0;
                long jA053 = 0;
                int iA0215 = 0;
                int iA0216 = 0;
                int iA0217 = 0;
                int iA0218 = 0;
                int iA0219 = -1;
                while (parcel.dataPosition() < iA0020) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iA0215 = AbstractC4159CoF.A02(parcel, i19);
                            break;
                        case 2:
                            iA0216 = AbstractC4159CoF.A02(parcel, i19);
                            break;
                        case 3:
                            iA0217 = AbstractC4159CoF.A02(parcel, i19);
                            break;
                        case 4:
                            jA052 = AbstractC4159CoF.A05(parcel, i19);
                            break;
                        case 5:
                            jA053 = AbstractC4159CoF.A05(parcel, i19);
                            break;
                        case 6:
                            strA0928 = AbstractC4159CoF.A09(parcel, i19);
                            break;
                        case 7:
                            strA0929 = AbstractC4159CoF.A09(parcel, i19);
                            break;
                        case '\b':
                            iA0218 = AbstractC4159CoF.A02(parcel, i19);
                            break;
                        case '\t':
                            iA0219 = AbstractC4159CoF.A02(parcel, i19);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i19);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0020);
                return new MethodInvocation(strA0928, strA0929, iA0215, iA0216, iA0217, iA0218, iA0219, jA052, jA053);
            case 27:
                int iA0021 = AbstractC4159CoF.A00(parcel);
                Account account2 = null;
                GoogleSignInAccount googleSignInAccount = null;
                int iA0220 = 0;
                int iA0221 = 0;
                while (parcel.dataPosition() < iA0021) {
                    int i20 = parcel.readInt();
                    char c10 = (char) i20;
                    if (c10 == 1) {
                        iA0220 = AbstractC4159CoF.A02(parcel, i20);
                    } else if (c10 == 2) {
                        account2 = (Account) AbstractC4159CoF.A08(parcel, Account.CREATOR, i20);
                    } else if (c10 == 3) {
                        iA0221 = AbstractC4159CoF.A02(parcel, i20);
                    } else if (c10 != 4) {
                        AbstractC4159CoF.A0E(parcel, i20);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC4159CoF.A08(parcel, GoogleSignInAccount.CREATOR, i20);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0021);
                return new zat(account2, googleSignInAccount, iA0220, iA0221);
            case 28:
                int iA0022 = AbstractC4159CoF.A00(parcel);
                IBinder iBinderA07 = null;
                ConnectionResult connectionResult2 = null;
                int iA0222 = 0;
                boolean zA1L12 = false;
                boolean zA0H3 = false;
                while (parcel.dataPosition() < iA0022) {
                    int i21 = parcel.readInt();
                    char c11 = (char) i21;
                    if (c11 == 1) {
                        iA0222 = AbstractC4159CoF.A02(parcel, i21);
                    } else if (c11 == 2) {
                        iBinderA07 = AbstractC4159CoF.A07(parcel, i21);
                    } else if (c11 == 3) {
                        connectionResult2 = (ConnectionResult) AbstractC4159CoF.A08(parcel, ConnectionResult.CREATOR, i21);
                    } else if (c11 != 4) {
                        zA0H3 = AbstractC4159CoF.A0H(parcel, c11, 5, i21, zA0H3);
                    } else {
                        zA1L12 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i21));
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0022);
                return new zav(iBinderA07, connectionResult2, iA0222, zA1L12, zA0H3);
            case 29:
                int iA0023 = AbstractC4159CoF.A00(parcel);
                int iA0223 = 0;
                boolean zA1L13 = false;
                boolean zA1L14 = false;
                int iA01 = 0;
                int iA012 = 0;
                while (parcel.dataPosition() < iA0023) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        iA0223 = AbstractC4159CoF.A02(parcel, i22);
                    } else if (c12 == 2) {
                        zA1L13 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i22));
                    } else if (c12 == 3) {
                        zA1L14 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i22));
                    } else if (c12 == 4) {
                        iA01 = AbstractC4159CoF.A01(parcel, i22);
                    } else if (c12 != 5) {
                        AbstractC4159CoF.A0E(parcel, i22);
                    } else {
                        iA012 = AbstractC4159CoF.A01(parcel, i22);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0023);
                return new RootTelemetryConfiguration(iA0223, iA01, iA012, zA1L13, zA1L14);
            case 30:
                int iA0024 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA063 = null;
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int iA0224 = 0;
                while (parcel.dataPosition() < iA0024) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        bundleA063 = AbstractC4159CoF.A06(parcel, i23);
                    } else if (c13 == 2) {
                        featureArr = (Feature[]) AbstractC4159CoF.A0J(parcel, Feature.CREATOR, i23);
                    } else if (c13 == 3) {
                        iA0224 = AbstractC4159CoF.A02(parcel, i23);
                    } else if (c13 != 4) {
                        AbstractC4159CoF.A0E(parcel, i23);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) AbstractC4159CoF.A08(parcel, ConnectionTelemetryConfiguration.CREATOR, i23);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0024);
                zzk zzkVar = new zzk();
                zzkVar.A01 = bundleA063;
                zzkVar.A03 = featureArr;
                zzkVar.A00 = iA0224;
                zzkVar.A02 = connectionTelemetryConfiguration;
                return zzkVar;
            case 31:
                int iA0025 = AbstractC4159CoF.A00(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zA1L15 = false;
                boolean zA1L16 = false;
                int iA0225 = 0;
                while (parcel.dataPosition() < iA0025) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) AbstractC4159CoF.A08(parcel, RootTelemetryConfiguration.CREATOR, i24);
                            continue;
                        case 2:
                            zA1L15 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i24));
                            continue;
                        case 3:
                            zA1L16 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i24));
                            continue;
                        case 4:
                            iA03 = AbstractC4159CoF.A03(parcel, i24);
                            iDataPosition = parcel.dataPosition();
                            if (iA03 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                break;
                            } else {
                                iArrCreateIntArray = null;
                            }
                        case 5:
                            iA0225 = AbstractC4159CoF.A02(parcel, i24);
                            continue;
                        case 6:
                            iA03 = AbstractC4159CoF.A03(parcel, i24);
                            iDataPosition = parcel.dataPosition();
                            if (iA03 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                        default:
                            AbstractC4159CoF.A0E(parcel, i24);
                            continue;
                    }
                    parcel.setDataPosition(iDataPosition + iA03);
                }
                AbstractC4159CoF.A0D(parcel, iA0025);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, iArrCreateIntArray, iArrCreateIntArray2, iA0225, zA1L15, zA1L16);
            case 32:
                int iA0026 = AbstractC4159CoF.A00(parcel);
                Scope[] scopeArr = GetServiceRequest.A0F;
                Bundle bundleA0N = BV6.A0N();
                Feature[] featureArr2 = GetServiceRequest.A0E;
                String strA0930 = null;
                Feature[] featureArr3 = featureArr2;
                IBinder iBinderA072 = null;
                Account account3 = null;
                String strA0931 = null;
                int iA0226 = 0;
                int iA0227 = 0;
                int iA0228 = 0;
                boolean zA1L17 = false;
                int iA0229 = 0;
                boolean zA1L18 = false;
                while (parcel.dataPosition() < iA0026) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iA0226 = AbstractC4159CoF.A02(parcel, i25);
                            break;
                        case 2:
                            iA0227 = AbstractC4159CoF.A02(parcel, i25);
                            break;
                        case 3:
                            iA0228 = AbstractC4159CoF.A02(parcel, i25);
                            break;
                        case 4:
                            strA0930 = AbstractC4159CoF.A09(parcel, i25);
                            break;
                        case 5:
                            iBinderA072 = AbstractC4159CoF.A07(parcel, i25);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC4159CoF.A0J(parcel, Scope.CREATOR, i25);
                            break;
                        case 7:
                            bundleA0N = AbstractC4159CoF.A06(parcel, i25);
                            break;
                        case '\b':
                            account3 = (Account) AbstractC4159CoF.A08(parcel, Account.CREATOR, i25);
                            break;
                        case '\t':
                        default:
                            AbstractC4159CoF.A0E(parcel, i25);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) AbstractC4159CoF.A0J(parcel, Feature.CREATOR, i25);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) AbstractC4159CoF.A0J(parcel, Feature.CREATOR, i25);
                            break;
                        case '\f':
                            zA1L17 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i25));
                            break;
                        case '\r':
                            iA0229 = AbstractC4159CoF.A02(parcel, i25);
                            break;
                        case 14:
                            zA1L18 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i25));
                            break;
                        case 15:
                            strA0931 = AbstractC4159CoF.A09(parcel, i25);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0026);
                return new GetServiceRequest(account3, bundleA0N, iBinderA072, strA0930, strA0931, featureArr2, featureArr3, scopeArr, iA0226, iA0227, iA0228, iA0229, zA1L17, zA1L18);
            case 33:
                int iA0027 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C5 = null;
                String strA0932 = null;
                String strA0A5 = null;
                boolean zA1L19 = false;
                while (parcel.dataPosition() < iA0027) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 1) {
                        arrayListA0C5 = AbstractC4159CoF.A0C(parcel, Feature.CREATOR, i26);
                    } else if (c14 == 2) {
                        zA1L19 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i26));
                    } else if (c14 != 3) {
                        strA0A5 = AbstractC4159CoF.A0A(parcel, strA0A5, c14, 4, i26);
                    } else {
                        strA0932 = AbstractC4159CoF.A09(parcel, i26);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0027);
                return new ApiFeatureRequest(arrayListA0C5, strA0932, strA0A5, zA1L19);
            case 34:
                int iA0028 = AbstractC4159CoF.A00(parcel);
                boolean zA1L20 = false;
                int iA042 = 0;
                while (parcel.dataPosition() < iA0028) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 != 1) {
                        iA042 = AbstractC4159CoF.A04(parcel, c15, 2, i27, iA042);
                    } else {
                        zA1L20 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i27));
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0028);
                return new ModuleAvailabilityResponse(zA1L20, iA042);
            case 35:
                int iA0029 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntentA012 = null;
                while (parcel.dataPosition() < iA0029) {
                    pendingIntentA012 = A01(pendingIntentA012, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0029);
                return new ModuleInstallIntentResponse(pendingIntentA012);
            case 36:
                int iA0030 = AbstractC4159CoF.A00(parcel);
                int iA0230 = 0;
                boolean zA0H4 = false;
                while (parcel.dataPosition() < iA0030) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 != 1) {
                        zA0H4 = AbstractC4159CoF.A0H(parcel, c16, 2, i28, zA0H4);
                    } else {
                        iA0230 = AbstractC4159CoF.A02(parcel, i28);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0030);
                return new ModuleInstallResponse(iA0230, zA0H4);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                int iA0031 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntent2 = null;
                String strA0A6 = null;
                int iA0231 = 0;
                int iA0232 = 0;
                while (parcel.dataPosition() < iA0031) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        iA0231 = AbstractC4159CoF.A02(parcel, i29);
                    } else if (c17 == 2) {
                        iA0232 = AbstractC4159CoF.A02(parcel, i29);
                    } else if (c17 != 3) {
                        strA0A6 = AbstractC4159CoF.A0A(parcel, strA0A6, c17, 4, i29);
                    } else {
                        pendingIntent2 = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i29);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0031);
                return new ConnectionResult(pendingIntent2, strA0A6, iA0231, iA0232);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                int iA0032 = AbstractC4159CoF.A00(parcel);
                long jA054 = -1;
                int iA0233 = 0;
                String strA0933 = null;
                while (parcel.dataPosition() < iA0032) {
                    int i30 = parcel.readInt();
                    char c18 = (char) i30;
                    if (c18 == 1) {
                        strA0933 = AbstractC4159CoF.A09(parcel, i30);
                    } else if (c18 == 2) {
                        iA0233 = AbstractC4159CoF.A02(parcel, i30);
                    } else if (c18 != 3) {
                        AbstractC4159CoF.A0E(parcel, i30);
                    } else {
                        jA054 = AbstractC4159CoF.A05(parcel, i30);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0032);
                return new Feature(strA0933, iA0233, jA054);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                String string = parcel.readString();
                try {
                    if (string.equals("hybrid")) {
                        BYT.A01.A00.AjM();
                        DWq.A02.AjM();
                        throw F60.createAndThrow();
                    }
                    for (Transport transport : Transport.values()) {
                        if (string.equals(transport.zzc)) {
                            return transport;
                        }
                    }
                    throw new Transport.UnsupportedTransportException(String.format("Transport %s not supported", string));
                } catch (Transport.UnsupportedTransportException e) {
                    throw BV4.A0e(e);
                }
            case 40:
                int iA0033 = AbstractC4159CoF.A00(parcel);
                String strA0934 = null;
                String strA0935 = null;
                byte[] bArrA0I2 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String strA0936 = null;
                while (parcel.dataPosition() < iA0033) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            strA0934 = AbstractC4159CoF.A09(parcel, i31);
                            break;
                        case 2:
                            strA0935 = AbstractC4159CoF.A09(parcel, i31);
                            break;
                        case 3:
                            bArrA0I2 = AbstractC4159CoF.A0I(parcel, i31);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) AbstractC4159CoF.A08(parcel, AuthenticatorAttestationResponse.CREATOR, i31);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) AbstractC4159CoF.A08(parcel, AuthenticatorAssertionResponse.CREATOR, i31);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) AbstractC4159CoF.A08(parcel, AuthenticatorErrorResponse.CREATOR, i31);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) AbstractC4159CoF.A08(parcel, AuthenticationExtensionsClientOutputs.CREATOR, i31);
                            break;
                        case '\b':
                            strA0936 = AbstractC4159CoF.A09(parcel, i31);
                            break;
                        case '\t':
                            AbstractC4159CoF.A09(parcel, i31);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i31);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0033);
                return new PublicKeyCredential(authenticationExtensionsClientOutputs, authenticatorAssertionResponse, authenticatorAttestationResponse, authenticatorErrorResponse, strA0934, strA0935, strA0936, bArrA0I2);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                int iA0034 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C6 = null;
                while (parcel.dataPosition() < iA0034) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        AbstractC4159CoF.A0E(parcel, i32);
                    } else {
                        arrayListA0C6 = AbstractC4159CoF.A0C(parcel, UvmEntry.CREATOR, i32);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0034);
                return new UvmEntries(arrayListA0C6);
            case 42:
                int iA0035 = AbstractC4159CoF.A00(parcel);
                int iA0234 = 0;
                short sA02 = 0;
                short sA022 = 0;
                while (parcel.dataPosition() < iA0035) {
                    int i33 = parcel.readInt();
                    char c19 = (char) i33;
                    if (c19 == 1) {
                        iA0234 = AbstractC4159CoF.A02(parcel, i33);
                    } else if (c19 == 2) {
                        sA02 = (short) AbstractC4159CoF.A02(parcel, i33);
                    } else if (c19 != 3) {
                        AbstractC4159CoF.A0E(parcel, i33);
                    } else {
                        sA022 = (short) AbstractC4159CoF.A02(parcel, i33);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0035);
                return new UvmEntry(iA0234, sA02, sA022);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                int iA0036 = AbstractC4159CoF.A00(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                String strA0A7 = null;
                while (parcel.dataPosition() < iA0036) {
                    int i34 = parcel.readInt();
                    char c20 = (char) i34;
                    if (c20 == 1) {
                        uvmEntries = (UvmEntries) AbstractC4159CoF.A08(parcel, UvmEntries.CREATOR, i34);
                    } else if (c20 == 2) {
                        zzfVar = (zzf) AbstractC4159CoF.A08(parcel, zzf.CREATOR, i34);
                    } else if (c20 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) AbstractC4159CoF.A08(parcel, AuthenticationExtensionsCredPropsOutputs.CREATOR, i34);
                    } else if (c20 != 4) {
                        strA0A7 = AbstractC4159CoF.A0A(parcel, strA0A7, c20, 5, i34);
                    } else {
                        zzhVar = (zzh) AbstractC4159CoF.A08(parcel, zzh.CREATOR, i34);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0036);
                return new AuthenticationExtensionsClientOutputs(authenticationExtensionsCredPropsOutputs, uvmEntries, zzfVar, zzhVar, strA0A7);
            case 44:
                int iA0037 = AbstractC4159CoF.A00(parcel);
                boolean zA0H5 = false;
                while (parcel.dataPosition() < iA0037) {
                    int i35 = parcel.readInt();
                    zA0H5 = AbstractC4159CoF.A0H(parcel, (char) i35, 1, i35, zA0H5);
                }
                AbstractC4159CoF.A0D(parcel, iA0037);
                return new AuthenticationExtensionsCredPropsOutputs(zA0H5);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                int iA0038 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I3 = null;
                byte[] bArrA0I4 = null;
                while (parcel.dataPosition() < iA0038) {
                    int i36 = parcel.readInt();
                    char c21 = (char) i36;
                    if (c21 == 1) {
                        bArrA0I3 = AbstractC4159CoF.A0I(parcel, i36);
                    } else if (c21 != 2) {
                        AbstractC4159CoF.A0E(parcel, i36);
                    } else {
                        bArrA0I4 = AbstractC4159CoF.A0I(parcel, i36);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0038);
                return new zzf(bArrA0I3 == null ? null : DA8.A01(bArrA0I3, bArrA0I3.length), bArrA0I4 != null ? DA8.A01(bArrA0I4, bArrA0I4.length) : null);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                int iA0039 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I5 = null;
                boolean zA1L21 = false;
                while (parcel.dataPosition() < iA0039) {
                    int i37 = parcel.readInt();
                    char c22 = (char) i37;
                    if (c22 == 1) {
                        zA1L21 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i37));
                    } else if (c22 != 2) {
                        AbstractC4159CoF.A0E(parcel, i37);
                    } else {
                        bArrA0I5 = AbstractC4159CoF.A0I(parcel, i37);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0039);
                return new zzh(bArrA0I5 != null ? DA8.A01(bArrA0I5, bArrA0I5.length) : null, zA1L21);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                int iA0040 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I6 = null;
                byte[] bArrA0I7 = null;
                byte[] bArrA0I8 = null;
                byte[] bArrA0I9 = null;
                byte[] bArrA0I10 = null;
                while (parcel.dataPosition() < iA0040) {
                    int i38 = parcel.readInt();
                    char c23 = (char) i38;
                    if (c23 == 2) {
                        bArrA0I6 = AbstractC4159CoF.A0I(parcel, i38);
                    } else if (c23 == 3) {
                        bArrA0I7 = AbstractC4159CoF.A0I(parcel, i38);
                    } else if (c23 == 4) {
                        bArrA0I8 = AbstractC4159CoF.A0I(parcel, i38);
                    } else if (c23 == 5) {
                        bArrA0I9 = AbstractC4159CoF.A0I(parcel, i38);
                    } else if (c23 != 6) {
                        AbstractC4159CoF.A0E(parcel, i38);
                    } else {
                        bArrA0I10 = AbstractC4159CoF.A0I(parcel, i38);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0040);
                return new AuthenticatorAssertionResponse(bArrA0I6, bArrA0I7, bArrA0I8, bArrA0I9, bArrA0I10);
            case 48:
                int iA0041 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I11 = null;
                byte[] bArrA0I12 = null;
                byte[] bArrA0I13 = null;
                String[] strArrCreateStringArray2 = null;
                while (parcel.dataPosition() < iA0041) {
                    int i39 = parcel.readInt();
                    char c24 = (char) i39;
                    if (c24 == 2) {
                        bArrA0I11 = AbstractC4159CoF.A0I(parcel, i39);
                    } else if (c24 == 3) {
                        bArrA0I12 = AbstractC4159CoF.A0I(parcel, i39);
                    } else if (c24 == 4) {
                        bArrA0I13 = AbstractC4159CoF.A0I(parcel, i39);
                    } else if (c24 != 5) {
                        AbstractC4159CoF.A0E(parcel, i39);
                    } else {
                        int iA033 = AbstractC4159CoF.A03(parcel, i39);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iA033 == 0) {
                            strArrCreateStringArray2 = null;
                        } else {
                            strArrCreateStringArray2 = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition3 + iA033);
                        }
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0041);
                return new AuthenticatorAttestationResponse(bArrA0I11, bArrA0I12, bArrA0I13, strArrCreateStringArray2);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                int iA0042 = AbstractC4159CoF.A00(parcel);
                int iA0235 = 0;
                String strA0937 = null;
                int iA013 = 0;
                while (parcel.dataPosition() < iA0042) {
                    int i40 = parcel.readInt();
                    char c25 = (char) i40;
                    if (c25 == 2) {
                        iA0235 = AbstractC4159CoF.A02(parcel, i40);
                    } else if (c25 == 3) {
                        strA0937 = AbstractC4159CoF.A09(parcel, i40);
                    } else if (c25 != 4) {
                        AbstractC4159CoF.A0E(parcel, i40);
                    } else {
                        iA013 = AbstractC4159CoF.A01(parcel, i40);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0042);
                return new AuthenticatorErrorResponse(iA0235, strA0937, iA013);
            case 50:
                int i41 = parcel.readInt();
                try {
                    for (ErrorCode errorCode : ErrorCode.values()) {
                        if (i41 == errorCode.zzb) {
                            return errorCode;
                        }
                    }
                    throw new ErrorCode.UnsupportedErrorCodeException(String.format(Locale.US, "Error code %d is not supported", BV5.A1Y(i41)));
                } catch (ErrorCode.UnsupportedErrorCodeException e2) {
                    throw new IllegalArgumentException(e2);
                }
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                int iA0043 = AbstractC4159CoF.A00(parcel);
                boolean zA0H6 = false;
                while (parcel.dataPosition() < iA0043) {
                    int i42 = parcel.readInt();
                    zA0H6 = AbstractC4159CoF.A0H(parcel, (char) i42, 1, i42, zA0H6);
                }
                AbstractC4159CoF.A0D(parcel, iA0043);
                return new ClearCreationOptionsResponse(zA0H6);
            case 52:
                int iA0044 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0044) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0044);
                return new ClearCredentialStateRequest();
            case 53:
                int iA0045 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0045) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0045);
                return new ClearCredentialStateResponse();
            case 54:
                int iA0046 = AbstractC4159CoF.A00(parcel);
                boolean zA0H7 = false;
                while (parcel.dataPosition() < iA0046) {
                    int i43 = parcel.readInt();
                    zA0H7 = AbstractC4159CoF.A0H(parcel, (char) i43, 1, i43, zA0H7);
                }
                AbstractC4159CoF.A0D(parcel, iA0046);
                return new ClearExportResponse(zA0H7);
            case 55:
                int iA0047 = AbstractC4159CoF.A00(parcel);
                boolean zA0H8 = false;
                while (parcel.dataPosition() < iA0047) {
                    int i44 = parcel.readInt();
                    zA0H8 = AbstractC4159CoF.A0H(parcel, (char) i44, 1, i44, zA0H8);
                }
                AbstractC4159CoF.A0D(parcel, iA0047);
                return new ClearRegistryResponse(zA0H8);
            case 56:
                int iA0048 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntent3 = null;
                CreateCredentialResponse createCredentialResponse = null;
                while (parcel.dataPosition() < iA0048) {
                    int i45 = parcel.readInt();
                    char c26 = (char) i45;
                    if (c26 == 1) {
                        pendingIntent3 = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i45);
                    } else if (c26 != 2) {
                        AbstractC4159CoF.A0E(parcel, i45);
                    } else {
                        createCredentialResponse = (CreateCredentialResponse) AbstractC4159CoF.A08(parcel, CreateCredentialResponse.CREATOR, i45);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0048);
                return new CreateCredentialHandle(pendingIntent3, createCredentialResponse);
            case 57:
                int iA0049 = AbstractC4159CoF.A00(parcel);
                String strA0938 = null;
                Bundle bundleA064 = null;
                while (parcel.dataPosition() < iA0049) {
                    int i46 = parcel.readInt();
                    char c27 = (char) i46;
                    if (c27 == 1) {
                        strA0938 = AbstractC4159CoF.A09(parcel, i46);
                    } else if (c27 != 2) {
                        AbstractC4159CoF.A0E(parcel, i46);
                    } else {
                        bundleA064 = AbstractC4159CoF.A06(parcel, i46);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0049);
                return new CreateCredentialResponse(strA0938, bundleA064);
            case 58:
                int iA0050 = AbstractC4159CoF.A00(parcel);
                String strA0939 = "";
                Bundle bundleA065 = null;
                String strA0940 = "";
                String strA0941 = "";
                Bundle bundleA066 = null;
                String strA0942 = null;
                while (parcel.dataPosition() < iA0050) {
                    int i47 = parcel.readInt();
                    switch ((char) i47) {
                        case 1:
                            strA0939 = AbstractC4159CoF.A09(parcel, i47);
                            break;
                        case 2:
                            bundleA065 = AbstractC4159CoF.A06(parcel, i47);
                            break;
                        case 3:
                            bundleA066 = AbstractC4159CoF.A06(parcel, i47);
                            break;
                        case 4:
                            strA0942 = AbstractC4159CoF.A09(parcel, i47);
                            break;
                        case 5:
                            strA0940 = AbstractC4159CoF.A09(parcel, i47);
                            break;
                        case 6:
                            strA0941 = AbstractC4159CoF.A09(parcel, i47);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i47);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0050);
                return new CredentialOption(bundleA065, bundleA066, strA0939, strA0942, strA0940, strA0941);
            case 59:
                int iA0051 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA023 = null;
                while (parcel.dataPosition() < iA0051) {
                    bundleA023 = A02(bundleA023, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0051);
                return new CredentialTransferCapabilities(bundleA023);
            case 60:
                int iA0052 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA024 = null;
                while (parcel.dataPosition() < iA0052) {
                    bundleA024 = A02(bundleA024, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0052);
                return new ExportCredentialsToDeviceSetupResponse(bundleA024);
            case 61:
                int iA0053 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C7 = null;
                Bundle bundleA067 = null;
                String strA0943 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iA0053) {
                    int i48 = parcel.readInt();
                    char c28 = (char) i48;
                    if (c28 == 1) {
                        arrayListA0C7 = AbstractC4159CoF.A0C(parcel, CredentialOption.CREATOR, i48);
                    } else if (c28 == 2) {
                        bundleA067 = AbstractC4159CoF.A06(parcel, i48);
                    } else if (c28 == 3) {
                        strA0943 = AbstractC4159CoF.A09(parcel, i48);
                    } else if (c28 != 4) {
                        AbstractC4159CoF.A0E(parcel, i48);
                    } else {
                        resultReceiver = (ResultReceiver) AbstractC4159CoF.A08(parcel, ResultReceiver.CREATOR, i48);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0053);
                return new GetCredentialRequest(bundleA067, resultReceiver, strA0943, arrayListA0C7);
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                int iA0054 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA025 = null;
                while (parcel.dataPosition() < iA0054) {
                    bundleA025 = A02(bundleA025, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0054);
                return new ImportCredentialsForDeviceSetupResponse(bundleA025);
            case 63:
                int iA0055 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntentA013 = null;
                while (parcel.dataPosition() < iA0055) {
                    pendingIntentA013 = A01(pendingIntentA013, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0055);
                return new PendingGetCredentialHandle(pendingIntentA013);
            case 64:
                int iA0056 = AbstractC4159CoF.A00(parcel);
                PendingIntent pendingIntentA014 = null;
                while (parcel.dataPosition() < iA0056) {
                    pendingIntentA014 = A01(pendingIntentA014, parcel);
                }
                AbstractC4159CoF.A0D(parcel, iA0056);
                return new PendingImportCredentialsHandle(pendingIntentA014);
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                int iA0057 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0057) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0057);
                return new RegisterCreationOptionsResponse();
            case 66:
                int iA0058 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0058) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0058);
                return new RegisterExportResponse();
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                int iA0059 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0059) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0059);
                return new RegistrationResponse();
            case 68:
                int iA0060 = AbstractC4159CoF.A00(parcel);
                String strA0944 = null;
                String strA0945 = null;
                Bundle bundleA068 = null;
                while (parcel.dataPosition() < iA0060) {
                    int i49 = parcel.readInt();
                    char c29 = (char) i49;
                    if (c29 == 1) {
                        strA0944 = AbstractC4159CoF.A09(parcel, i49);
                    } else if (c29 == 2) {
                        strA0945 = AbstractC4159CoF.A09(parcel, i49);
                    } else if (c29 != 3) {
                        AbstractC4159CoF.A0E(parcel, i49);
                    } else {
                        bundleA068 = AbstractC4159CoF.A06(parcel, i49);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0060);
                return new SignalCredentialStateRequest(bundleA068, strA0944, strA0945);
            case 69:
                int iA0061 = AbstractC4159CoF.A00(parcel);
                while (parcel.dataPosition() < iA0061) {
                    AbstractC4159CoF.A0E(parcel, parcel.readInt());
                }
                AbstractC4159CoF.A0D(parcel, iA0061);
                return new SignalCredentialStateResponse();
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                int iA0062 = AbstractC4159CoF.A00(parcel);
                IBinder iBinderA073 = null;
                IBinder iBinderA074 = null;
                PendingIntent pendingIntent4 = null;
                String strA0A8 = null;
                int iA0236 = 0;
                while (parcel.dataPosition() < iA0062) {
                    int i50 = parcel.readInt();
                    char c30 = (char) i50;
                    if (c30 == 1) {
                        iA0236 = AbstractC4159CoF.A02(parcel, i50);
                    } else if (c30 == 2) {
                        iBinderA073 = AbstractC4159CoF.A07(parcel, i50);
                    } else if (c30 == 3) {
                        iBinderA074 = AbstractC4159CoF.A07(parcel, i50);
                    } else if (c30 != 4) {
                        strA0A8 = AbstractC4159CoF.A0A(parcel, strA0A8, c30, 6, i50);
                    } else {
                        pendingIntent4 = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i50);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0062);
                return new zzee(pendingIntent4, iBinderA073, iBinderA074, strA0A8, iA0236);
            case 71:
                int iA0063 = AbstractC4159CoF.A00(parcel);
                LocationRequest locationRequest = null;
                long jA055 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                ArrayList arrayListA0C8 = null;
                boolean zA1L22 = false;
                boolean zA1L23 = false;
                boolean zA1L24 = false;
                boolean zA1L25 = false;
                while (parcel.dataPosition() < iA0063) {
                    int i51 = parcel.readInt();
                    char c31 = (char) i51;
                    if (c31 == 1) {
                        locationRequest = (LocationRequest) AbstractC4159CoF.A08(parcel, LocationRequest.CREATOR, i51);
                    } else if (c31 == 5) {
                        arrayListA0C8 = AbstractC4159CoF.A0C(parcel, ClientIdentity.CREATOR, i51);
                    } else if (c31 == '\b') {
                        zA1L22 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i51));
                    } else if (c31 != '\t') {
                        switch (c31) {
                            case 11:
                                zA1L24 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i51));
                                break;
                            case '\f':
                                zA1L25 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i51));
                                break;
                            case '\r':
                                AbstractC4159CoF.A09(parcel, i51);
                                break;
                            case 14:
                                jA055 = AbstractC4159CoF.A05(parcel, i51);
                                break;
                            default:
                                AbstractC4159CoF.A0E(parcel, i51);
                                break;
                        }
                    } else {
                        zA1L23 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i51));
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0063);
                return new zzeg(locationRequest, arrayListA0C8, jA055, zA1L22, zA1L23, zA1L24, zA1L25);
            case 72:
                int iA0064 = AbstractC4159CoF.A00(parcel);
                zzeg zzegVar = null;
                IBinder iBinderA075 = null;
                IBinder iBinderA076 = null;
                PendingIntent pendingIntent5 = null;
                IBinder iBinderA077 = null;
                String strA0946 = null;
                int iA0237 = 1;
                while (parcel.dataPosition() < iA0064) {
                    int i52 = parcel.readInt();
                    switch ((char) i52) {
                        case 1:
                            iA0237 = AbstractC4159CoF.A02(parcel, i52);
                            break;
                        case 2:
                            zzegVar = (zzeg) AbstractC4159CoF.A08(parcel, zzeg.CREATOR, i52);
                            break;
                        case 3:
                            iBinderA075 = AbstractC4159CoF.A07(parcel, i52);
                            break;
                        case 4:
                            pendingIntent5 = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i52);
                            break;
                        case 5:
                            iBinderA076 = AbstractC4159CoF.A07(parcel, i52);
                            break;
                        case 6:
                            iBinderA077 = AbstractC4159CoF.A07(parcel, i52);
                            break;
                        case 7:
                        default:
                            AbstractC4159CoF.A0E(parcel, i52);
                            break;
                        case '\b':
                            strA0946 = AbstractC4159CoF.A09(parcel, i52);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0064);
                return new zzei(pendingIntent5, iBinderA075, iBinderA076, iBinderA077, zzegVar, strA0946, iA0237);
            case 73:
                int iA0065 = AbstractC4159CoF.A00(parcel);
                String strA0947 = null;
                long jA056 = 0;
                double d = 0.0d;
                double d2 = 0.0d;
                int iA0238 = 0;
                short sA023 = 0;
                float fA00 = 0.0f;
                int iA0239 = 0;
                int iA0240 = -1;
                while (parcel.dataPosition() < iA0065) {
                    int i53 = parcel.readInt();
                    switch ((char) i53) {
                        case 1:
                            strA0947 = AbstractC4159CoF.A09(parcel, i53);
                            break;
                        case 2:
                            jA056 = AbstractC4159CoF.A05(parcel, i53);
                            break;
                        case 3:
                            sA023 = (short) AbstractC4159CoF.A02(parcel, i53);
                            break;
                        case 4:
                            AbstractC4159CoF.A0F(parcel, i53, 8);
                            d = parcel.readDouble();
                            break;
                        case 5:
                            AbstractC4159CoF.A0F(parcel, i53, 8);
                            d2 = parcel.readDouble();
                            break;
                        case 6:
                            fA00 = A00(parcel, i53);
                            break;
                        case 7:
                            iA0238 = AbstractC4159CoF.A02(parcel, i53);
                            break;
                        case '\b':
                            iA0239 = AbstractC4159CoF.A02(parcel, i53);
                            break;
                        case '\t':
                            iA0240 = AbstractC4159CoF.A02(parcel, i53);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i53);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0065);
                return new zzek(strA0947, d, d2, fA00, iA0238, iA0239, iA0240, jA056, sA023);
            case 74:
                int iA0066 = AbstractC4159CoF.A00(parcel);
                String strA0A9 = "";
                ArrayList<String> arrayListA0B2 = null;
                PendingIntent pendingIntent6 = null;
                while (parcel.dataPosition() < iA0066) {
                    int i54 = parcel.readInt();
                    char c32 = (char) i54;
                    if (c32 == 1) {
                        arrayListA0B2 = AbstractC4159CoF.A0B(parcel, i54);
                    } else if (c32 != 2) {
                        strA0A9 = AbstractC4159CoF.A0A(parcel, strA0A9, c32, 3, i54);
                    } else {
                        pendingIntent6 = (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i54);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0066);
                return new zzem(pendingIntent6, strA0A9, arrayListA0B2);
            case 75:
                int iA0067 = AbstractC4159CoF.A00(parcel);
                String strA0948 = null;
                String strA0949 = null;
                String strA0950 = null;
                ArrayList arrayListA0C9 = null;
                zze zzeVar = null;
                int iA0241 = 0;
                while (parcel.dataPosition() < iA0067) {
                    int i55 = parcel.readInt();
                    char c33 = (char) i55;
                    if (c33 == 1) {
                        iA0241 = AbstractC4159CoF.A02(parcel, i55);
                    } else if (c33 == 3) {
                        strA0948 = AbstractC4159CoF.A09(parcel, i55);
                    } else if (c33 == 4) {
                        strA0949 = AbstractC4159CoF.A09(parcel, i55);
                    } else if (c33 == 6) {
                        strA0950 = AbstractC4159CoF.A09(parcel, i55);
                    } else if (c33 == 7) {
                        zzeVar = (zze) AbstractC4159CoF.A08(parcel, zze.CREATOR, i55);
                    } else if (c33 != '\b') {
                        AbstractC4159CoF.A0E(parcel, i55);
                    } else {
                        arrayListA0C9 = AbstractC4159CoF.A0C(parcel, Feature.CREATOR, i55);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0067);
                return new zze(zzeVar, strA0948, strA0949, strA0950, arrayListA0C9, iA0241);
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                int iA0068 = AbstractC4159CoF.A00(parcel);
                Status status = null;
                while (parcel.dataPosition() < iA0068) {
                    int i56 = parcel.readInt();
                    if (((char) i56) != 1) {
                        AbstractC4159CoF.A0E(parcel, i56);
                    } else {
                        status = (Status) AbstractC4159CoF.A08(parcel, Status.CREATOR, i56);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0068);
                return new zzl(status);
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                int iA0069 = AbstractC4159CoF.A00(parcel);
                PointF[] pointFArr = null;
                int iA043 = 0;
                while (parcel.dataPosition() < iA0069) {
                    int i57 = parcel.readInt();
                    char c34 = (char) i57;
                    if (c34 != 2) {
                        iA043 = AbstractC4159CoF.A04(parcel, c34, 3, i57, iA043);
                    } else {
                        pointFArr = (PointF[]) AbstractC4159CoF.A0J(parcel, PointF.CREATOR, i57);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0069);
                return new zzd(pointFArr, iA043);
            case 78:
                int iA0070 = AbstractC4159CoF.A00(parcel);
                zzn[] zznVarArr = null;
                zzd[] zzdVarArr = null;
                int iA0242 = 0;
                int iA0243 = 0;
                float fA002 = 0.0f;
                float fA003 = 0.0f;
                float fA004 = 0.0f;
                float fA005 = 0.0f;
                float fA006 = Float.MAX_VALUE;
                float fA007 = Float.MAX_VALUE;
                float fA008 = Float.MAX_VALUE;
                float fA009 = 0.0f;
                float fA0010 = 0.0f;
                float fA0011 = 0.0f;
                float fA0012 = -1.0f;
                while (parcel.dataPosition() < iA0070) {
                    int i58 = parcel.readInt();
                    switch ((char) i58) {
                        case 1:
                            iA0242 = AbstractC4159CoF.A02(parcel, i58);
                            break;
                        case 2:
                            iA0243 = AbstractC4159CoF.A02(parcel, i58);
                            break;
                        case 3:
                            fA002 = A00(parcel, i58);
                            break;
                        case 4:
                            fA003 = A00(parcel, i58);
                            break;
                        case 5:
                            fA004 = A00(parcel, i58);
                            break;
                        case 6:
                            fA005 = A00(parcel, i58);
                            break;
                        case 7:
                            fA006 = A00(parcel, i58);
                            break;
                        case '\b':
                            fA007 = A00(parcel, i58);
                            break;
                        case '\t':
                            zznVarArr = (zzn[]) AbstractC4159CoF.A0J(parcel, zzn.CREATOR, i58);
                            break;
                        case '\n':
                            fA009 = A00(parcel, i58);
                            break;
                        case 11:
                            fA0010 = A00(parcel, i58);
                            break;
                        case '\f':
                            fA0011 = A00(parcel, i58);
                            break;
                        case '\r':
                            zzdVarArr = (zzd[]) AbstractC4159CoF.A0J(parcel, zzd.CREATOR, i58);
                            break;
                        case 14:
                            fA008 = A00(parcel, i58);
                            break;
                        case 15:
                            fA0012 = A00(parcel, i58);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i58);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0070);
                return new com.google.android.gms.internal.mlkit_vision_face.zzf(zzdVarArr, zznVarArr, fA002, fA003, fA004, fA005, fA006, fA007, fA008, fA009, fA0010, fA0011, fA0012, iA0242, iA0243);
            case 79:
                int iA0071 = AbstractC4159CoF.A00(parcel);
                int iA0244 = 0;
                int iA0245 = 0;
                int iA0246 = 0;
                boolean zA1L26 = false;
                boolean zA1L27 = false;
                float fA0013 = -1.0f;
                while (parcel.dataPosition() < iA0071) {
                    int i59 = parcel.readInt();
                    switch ((char) i59) {
                        case 2:
                            iA0244 = AbstractC4159CoF.A02(parcel, i59);
                            break;
                        case 3:
                            iA0245 = AbstractC4159CoF.A02(parcel, i59);
                            break;
                        case 4:
                            iA0246 = AbstractC4159CoF.A02(parcel, i59);
                            break;
                        case 5:
                            zA1L26 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i59));
                            break;
                        case 6:
                            zA1L27 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i59));
                            break;
                        case 7:
                            fA0013 = A00(parcel, i59);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i59);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0071);
                com.google.android.gms.internal.mlkit_vision_face.zzh zzhVar2 = new com.google.android.gms.internal.mlkit_vision_face.zzh();
                zzhVar2.A01 = iA0244;
                zzhVar2.A02 = iA0245;
                zzhVar2.A03 = iA0246;
                zzhVar2.A04 = zA1L26;
                zzhVar2.A05 = zA1L27;
                zzhVar2.A00 = fA0013;
                return zzhVar2;
            case 80:
                int iA0072 = AbstractC4159CoF.A00(parcel);
                int iA0247 = 0;
                int iA014 = 0;
                float fA0014 = 0.0f;
                float f = 0.0f;
                while (parcel.dataPosition() < iA0072) {
                    int i60 = parcel.readInt();
                    char c35 = (char) i60;
                    if (c35 == 1) {
                        iA0247 = AbstractC4159CoF.A02(parcel, i60);
                    } else if (c35 == 2) {
                        fA0014 = A00(parcel, i60);
                    } else if (c35 == 3) {
                        AbstractC4159CoF.A0F(parcel, i60, 4);
                        f = parcel.readFloat();
                    } else if (c35 != 4) {
                        AbstractC4159CoF.A0E(parcel, i60);
                    } else {
                        iA014 = AbstractC4159CoF.A01(parcel, i60);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0072);
                return new zzn(iA0247, fA0014, f, iA014);
            case 81:
                int iA0073 = AbstractC4159CoF.A00(parcel);
                long jA057 = 0;
                int iA0248 = 0;
                int iA0249 = 0;
                int iA015 = 0;
                int iA016 = 0;
                while (parcel.dataPosition() < iA0073) {
                    int i61 = parcel.readInt();
                    char c36 = (char) i61;
                    if (c36 == 1) {
                        iA0248 = AbstractC4159CoF.A02(parcel, i61);
                    } else if (c36 == 2) {
                        iA0249 = AbstractC4159CoF.A02(parcel, i61);
                    } else if (c36 == 3) {
                        iA015 = AbstractC4159CoF.A01(parcel, i61);
                    } else if (c36 == 4) {
                        iA016 = AbstractC4159CoF.A01(parcel, i61);
                    } else if (c36 != 5) {
                        AbstractC4159CoF.A0E(parcel, i61);
                    } else {
                        jA057 = AbstractC4159CoF.A05(parcel, i61);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0073);
                return new zzoq(iA0248, iA0249, iA015, jA057, iA016);
            case 82:
                int iA0074 = AbstractC4159CoF.A00(parcel);
                int iA0250 = 0;
                ArrayList arrayListA0C10 = null;
                while (parcel.dataPosition() < iA0074) {
                    int i62 = parcel.readInt();
                    char c37 = (char) i62;
                    if (c37 == 1) {
                        iA0250 = AbstractC4159CoF.A02(parcel, i62);
                    } else if (c37 != 2) {
                        AbstractC4159CoF.A0E(parcel, i62);
                    } else {
                        arrayListA0C10 = AbstractC4159CoF.A0C(parcel, PointF.CREATOR, i62);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0074);
                return new zzos(iA0250, arrayListA0C10);
            case 83:
                int iA0075 = AbstractC4159CoF.A00(parcel);
                int iA0251 = 0;
                int iA0252 = 0;
                int iA0253 = 0;
                int iA0254 = 0;
                boolean zA1L28 = false;
                float fA0015 = 0.0f;
                while (parcel.dataPosition() < iA0075) {
                    int i63 = parcel.readInt();
                    switch ((char) i63) {
                        case 1:
                            iA0251 = AbstractC4159CoF.A02(parcel, i63);
                            break;
                        case 2:
                            iA0252 = AbstractC4159CoF.A02(parcel, i63);
                            break;
                        case 3:
                            iA0253 = AbstractC4159CoF.A02(parcel, i63);
                            break;
                        case 4:
                            iA0254 = AbstractC4159CoF.A02(parcel, i63);
                            break;
                        case 5:
                            zA1L28 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i63));
                            break;
                        case 6:
                            fA0015 = A00(parcel, i63);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i63);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0075);
                return new zzou(fA0015, iA0251, iA0252, iA0253, iA0254, zA1L28);
            case 84:
                int iA0076 = AbstractC4159CoF.A00(parcel);
                Rect rect = null;
                ArrayList arrayListA0C11 = null;
                ArrayList arrayListA0C12 = null;
                int iA0255 = 0;
                float fA0016 = 0.0f;
                float fA0017 = 0.0f;
                float fA0018 = 0.0f;
                float fA0019 = 0.0f;
                float fA0020 = 0.0f;
                float fA0021 = 0.0f;
                float fA0022 = 0.0f;
                while (parcel.dataPosition() < iA0076) {
                    int i64 = parcel.readInt();
                    switch ((char) i64) {
                        case 1:
                            iA0255 = AbstractC4159CoF.A02(parcel, i64);
                            break;
                        case 2:
                            rect = (Rect) AbstractC4159CoF.A08(parcel, Rect.CREATOR, i64);
                            break;
                        case 3:
                            fA0016 = A00(parcel, i64);
                            break;
                        case 4:
                            fA0017 = A00(parcel, i64);
                            break;
                        case 5:
                            fA0018 = A00(parcel, i64);
                            break;
                        case 6:
                            fA0019 = A00(parcel, i64);
                            break;
                        case 7:
                            fA0020 = A00(parcel, i64);
                            break;
                        case '\b':
                            fA0021 = A00(parcel, i64);
                            break;
                        case '\t':
                            fA0022 = A00(parcel, i64);
                            break;
                        case '\n':
                            arrayListA0C11 = AbstractC4159CoF.A0C(parcel, zzpc.CREATOR, i64);
                            break;
                        case 11:
                            arrayListA0C12 = AbstractC4159CoF.A0C(parcel, zzos.CREATOR, i64);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i64);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0076);
                return new zzow(rect, arrayListA0C11, arrayListA0C12, fA0016, fA0017, fA0018, fA0019, fA0020, fA0021, fA0022, iA0255);
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                int iA0077 = AbstractC4159CoF.A00(parcel);
                int iA0256 = 0;
                PointF pointF = null;
                while (parcel.dataPosition() < iA0077) {
                    int i65 = parcel.readInt();
                    char c38 = (char) i65;
                    if (c38 == 1) {
                        iA0256 = AbstractC4159CoF.A02(parcel, i65);
                    } else if (c38 != 2) {
                        AbstractC4159CoF.A0E(parcel, i65);
                    } else {
                        pointF = (PointF) AbstractC4159CoF.A08(parcel, PointF.CREATOR, i65);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0077);
                return new zzpc(pointF, iA0256);
            case 86:
                int iA0078 = AbstractC4159CoF.A00(parcel);
                long jA058 = 0;
                int iA0257 = 0;
                int iA017 = 0;
                int iA018 = 0;
                int iA019 = 0;
                while (parcel.dataPosition() < iA0078) {
                    int i66 = parcel.readInt();
                    char c39 = (char) i66;
                    if (c39 == 2) {
                        iA0257 = AbstractC4159CoF.A02(parcel, i66);
                    } else if (c39 == 3) {
                        iA017 = AbstractC4159CoF.A01(parcel, i66);
                    } else if (c39 == 4) {
                        iA018 = AbstractC4159CoF.A01(parcel, i66);
                    } else if (c39 == 5) {
                        jA058 = AbstractC4159CoF.A05(parcel, i66);
                    } else if (c39 != 6) {
                        AbstractC4159CoF.A0E(parcel, i66);
                    } else {
                        iA019 = AbstractC4159CoF.A01(parcel, i66);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0078);
                zzp zzpVar = new zzp();
                zzpVar.A00 = iA0257;
                zzpVar.A01 = iA017;
                zzpVar.A02 = iA018;
                zzpVar.A04 = jA058;
                zzpVar.A03 = iA019;
                return zzpVar;
            case 87:
                int iA0079 = AbstractC4159CoF.A00(parcel);
                String strA0951 = null;
                String strA0952 = null;
                float fA0023 = 0.0f;
                int iA044 = 0;
                while (parcel.dataPosition() < iA0079) {
                    int i67 = parcel.readInt();
                    char c40 = (char) i67;
                    if (c40 == 2) {
                        strA0952 = AbstractC4159CoF.A09(parcel, i67);
                    } else if (c40 == 3) {
                        fA0023 = A00(parcel, i67);
                    } else if (c40 != 4) {
                        iA044 = AbstractC4159CoF.A04(parcel, c40, 5, i67, iA044);
                    } else {
                        strA0951 = AbstractC4159CoF.A09(parcel, i67);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0079);
                return new com.google.android.gms.internal.mlkit_vision_label.zzh(strA0951, strA0952, fA0023, iA044);
            case 88:
                int iA0080 = AbstractC4159CoF.A00(parcel);
                int iA0258 = 0;
                int iA0110 = 0;
                int iA0111 = 0;
                float f2 = 0.0f;
                while (parcel.dataPosition() < iA0080) {
                    int i68 = parcel.readInt();
                    char c41 = (char) i68;
                    if (c41 == 2) {
                        iA0258 = AbstractC4159CoF.A02(parcel, i68);
                    } else if (c41 == 3) {
                        iA0110 = AbstractC4159CoF.A01(parcel, i68);
                    } else if (c41 == 4) {
                        AbstractC4159CoF.A0F(parcel, i68, 4);
                        f2 = parcel.readFloat();
                    } else if (c41 != 5) {
                        AbstractC4159CoF.A0E(parcel, i68);
                    } else {
                        iA0111 = AbstractC4159CoF.A01(parcel, i68);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0080);
                zzj zzjVar = new zzj();
                if (iA0258 != 1) {
                    throw C60O.A0i("Unknown language.");
                }
                zzjVar.A01 = 1;
                zzjVar.A02 = iA0110;
                zzjVar.A00 = f2;
                zzjVar.A03 = iA0111;
                return zzjVar;
            case 89:
                int iA0081 = AbstractC4159CoF.A00(parcel);
                int iA045 = 0;
                while (parcel.dataPosition() < iA0081) {
                    int i69 = parcel.readInt();
                    iA045 = AbstractC4159CoF.A04(parcel, (char) i69, 2, i69, iA045);
                }
                AbstractC4159CoF.A0D(parcel, iA0081);
                return new com.google.android.gms.internal.mlkit_vision_label.zzl(iA045);
            case 90:
                int iA0082 = AbstractC4159CoF.A00(parcel);
                long jA059 = 0;
                int iA0259 = 0;
                int iA0260 = 0;
                int iA0112 = 0;
                int iA0113 = 0;
                while (parcel.dataPosition() < iA0082) {
                    int i70 = parcel.readInt();
                    char c42 = (char) i70;
                    if (c42 == 1) {
                        iA0259 = AbstractC4159CoF.A02(parcel, i70);
                    } else if (c42 == 2) {
                        iA0260 = AbstractC4159CoF.A02(parcel, i70);
                    } else if (c42 == 3) {
                        iA0112 = AbstractC4159CoF.A01(parcel, i70);
                    } else if (c42 == 4) {
                        iA0113 = AbstractC4159CoF.A01(parcel, i70);
                    } else if (c42 != 5) {
                        AbstractC4159CoF.A0E(parcel, i70);
                    } else {
                        jA059 = AbstractC4159CoF.A05(parcel, i70);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0082);
                return new zzod(iA0259, iA0260, iA0112, jA059, iA0113);
            case 91:
                int iA0083 = AbstractC4159CoF.A00(parcel);
                String strA0953 = null;
                String strA0954 = null;
                float fA0024 = 0.0f;
                int iA0114 = 0;
                while (parcel.dataPosition() < iA0083) {
                    int i71 = parcel.readInt();
                    char c43 = (char) i71;
                    if (c43 == 1) {
                        strA0953 = AbstractC4159CoF.A09(parcel, i71);
                    } else if (c43 == 2) {
                        fA0024 = A00(parcel, i71);
                    } else if (c43 == 3) {
                        strA0954 = AbstractC4159CoF.A09(parcel, i71);
                    } else if (c43 != 4) {
                        AbstractC4159CoF.A0E(parcel, i71);
                    } else {
                        iA0114 = AbstractC4159CoF.A01(parcel, i71);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0083);
                return new zzoj(strA0953, strA0954, fA0024, iA0114);
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                int iA0084 = AbstractC4159CoF.A00(parcel);
                float fA0025 = 0.0f;
                int iA046 = 0;
                while (parcel.dataPosition() < iA0084) {
                    int i72 = parcel.readInt();
                    char c44 = (char) i72;
                    if (c44 != 1) {
                        iA046 = AbstractC4159CoF.A04(parcel, c44, 2, i72, iA046);
                    } else {
                        fA0025 = A00(parcel, i72);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0084);
                return new zzol(fA0025, iA046);
            case 93:
                int iA0085 = AbstractC4159CoF.A00(parcel);
                zzal[] zzalVarArr = null;
                long jA0510 = 0;
                int iA0261 = 1000;
                int iA0262 = 1;
                int iA0263 = 1;
                while (parcel.dataPosition() < iA0085) {
                    int i73 = parcel.readInt();
                    switch ((char) i73) {
                        case 1:
                            iA0262 = AbstractC4159CoF.A02(parcel, i73);
                            break;
                        case 2:
                            iA0263 = AbstractC4159CoF.A02(parcel, i73);
                            break;
                        case 3:
                            jA0510 = AbstractC4159CoF.A05(parcel, i73);
                            break;
                        case 4:
                            iA0261 = AbstractC4159CoF.A02(parcel, i73);
                            break;
                        case 5:
                            zzalVarArr = (zzal[]) AbstractC4159CoF.A0J(parcel, zzal.CREATOR, i73);
                            break;
                        case 6:
                            AbstractC4159CoF.A02(parcel, i73);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i73);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0085);
                return new LocationAvailability(zzalVarArr, iA0261, iA0262, iA0263, jA0510);
            case 94:
                int iA0086 = AbstractC4159CoF.A00(parcel);
                WorkSource workSource = new WorkSource();
                zze zzeVar2 = null;
                long jA0511 = -1;
                long jA0512 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                long jA0513 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                long jA0514 = 0;
                long jA0515 = 600000;
                long jA0516 = 3600000;
                int iA0264 = 102;
                int iA0265 = Integer.MAX_VALUE;
                float fA0026 = 0.0f;
                boolean zA1L29 = false;
                int iA0266 = 0;
                int iA0267 = 0;
                boolean zA1L30 = false;
                while (parcel.dataPosition() < iA0086) {
                    int i74 = parcel.readInt();
                    switch ((char) i74) {
                        case 1:
                            iA0264 = AbstractC4159CoF.A02(parcel, i74);
                            break;
                        case 2:
                            jA0516 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case 3:
                            jA0515 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case 4:
                        case 14:
                        default:
                            AbstractC4159CoF.A0E(parcel, i74);
                            break;
                        case 5:
                            jA0512 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case 6:
                            iA0265 = AbstractC4159CoF.A02(parcel, i74);
                            break;
                        case 7:
                            fA0026 = A00(parcel, i74);
                            break;
                        case '\b':
                            jA0514 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case '\t':
                            zA1L29 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i74));
                            break;
                        case '\n':
                            jA0513 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case 11:
                            jA0511 = AbstractC4159CoF.A05(parcel, i74);
                            break;
                        case '\f':
                            iA0266 = AbstractC4159CoF.A02(parcel, i74);
                            break;
                        case '\r':
                            iA0267 = AbstractC4159CoF.A02(parcel, i74);
                            break;
                        case 15:
                            zA1L30 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i74));
                            break;
                        case 16:
                            workSource = (WorkSource) AbstractC4159CoF.A08(parcel, WorkSource.CREATOR, i74);
                            break;
                        case 17:
                            zzeVar2 = (zze) AbstractC4159CoF.A08(parcel, zze.CREATOR, i74);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0086);
                return new LocationRequest(workSource, zzeVar2, fA0026, iA0264, iA0265, iA0266, iA0267, jA0516, jA0515, jA0514, jA0512, jA0513, jA0511, zA1L29, zA1L30);
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
                int iA0087 = AbstractC4159CoF.A00(parcel);
                List listA0C = LocationResult.A01;
                while (parcel.dataPosition() < iA0087) {
                    int i75 = parcel.readInt();
                    if (((char) i75) != 1) {
                        AbstractC4159CoF.A0E(parcel, i75);
                    } else {
                        listA0C = AbstractC4159CoF.A0C(parcel, Location.CREATOR, i75);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0087);
                return new LocationResult(listA0C);
            case 96:
                int iA0088 = AbstractC4159CoF.A00(parcel);
                long jA0517 = -1;
                long jA0518 = -1;
                int iA0268 = 1;
                int iA0269 = 1;
                while (parcel.dataPosition() < iA0088) {
                    int i76 = parcel.readInt();
                    char c45 = (char) i76;
                    if (c45 == 1) {
                        iA0268 = AbstractC4159CoF.A02(parcel, i76);
                    } else if (c45 == 2) {
                        iA0269 = AbstractC4159CoF.A02(parcel, i76);
                    } else if (c45 == 3) {
                        jA0517 = AbstractC4159CoF.A05(parcel, i76);
                    } else if (c45 != 4) {
                        AbstractC4159CoF.A0E(parcel, i76);
                    } else {
                        jA0518 = AbstractC4159CoF.A05(parcel, i76);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0088);
                return new zzal(iA0268, iA0269, jA0517, jA0518);
            case 97:
                int iA0089 = AbstractC4159CoF.A00(parcel);
                WorkSource workSource2 = new WorkSource();
                zze zzeVar3 = null;
                long jA0519 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                long jA0520 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                int iA0270 = 0;
                int iA0271 = 102;
                boolean zA1L31 = false;
                int iA0272 = 0;
                while (parcel.dataPosition() < iA0089) {
                    int i77 = parcel.readInt();
                    switch ((char) i77) {
                        case 1:
                            jA0519 = AbstractC4159CoF.A05(parcel, i77);
                            break;
                        case 2:
                            iA0270 = AbstractC4159CoF.A02(parcel, i77);
                            break;
                        case 3:
                            iA0271 = AbstractC4159CoF.A02(parcel, i77);
                            break;
                        case 4:
                            jA0520 = AbstractC4159CoF.A05(parcel, i77);
                            break;
                        case 5:
                            zA1L31 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i77));
                            break;
                        case 6:
                            workSource2 = (WorkSource) AbstractC4159CoF.A08(parcel, WorkSource.CREATOR, i77);
                            break;
                        case 7:
                            iA0272 = AbstractC4159CoF.A02(parcel, i77);
                            break;
                        case '\b':
                        default:
                            AbstractC4159CoF.A0E(parcel, i77);
                            break;
                        case '\t':
                            zzeVar3 = (zze) AbstractC4159CoF.A08(parcel, zze.CREATOR, i77);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0089);
                return new CurrentLocationRequest(workSource2, zzeVar3, iA0270, iA0271, iA0272, jA0519, jA0520, zA1L31);
            case 98:
                int iA0090 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C13 = null;
                String strA0A10 = null;
                int iA0273 = 0;
                while (parcel.dataPosition() < iA0090) {
                    int i78 = parcel.readInt();
                    char c46 = (char) i78;
                    if (c46 == 1) {
                        arrayListA0C13 = AbstractC4159CoF.A0C(parcel, zzek.CREATOR, i78);
                    } else if (c46 != 2) {
                        strA0A10 = AbstractC4159CoF.A0A(parcel, strA0A10, c46, 4, i78);
                    } else {
                        iA0273 = AbstractC4159CoF.A02(parcel, i78);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0090);
                return new GeofencingRequest(arrayListA0C13, iA0273, strA0A10);
            case 99:
                int iA0091 = AbstractC4159CoF.A00(parcel);
                Intent intent = null;
                int iA0274 = 0;
                int iA0275 = 0;
                while (parcel.dataPosition() < iA0091) {
                    int i79 = parcel.readInt();
                    char c47 = (char) i79;
                    if (c47 == 1) {
                        iA0274 = AbstractC4159CoF.A02(parcel, i79);
                    } else if (c47 == 2) {
                        iA0275 = AbstractC4159CoF.A02(parcel, i79);
                    } else if (c47 != 3) {
                        AbstractC4159CoF.A0E(parcel, i79);
                    } else {
                        intent = (Intent) AbstractC4159CoF.A08(parcel, Intent.CREATOR, i79);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0091);
                return new zaa(iA0274, iA0275, intent);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new StickyItemsLinearLayoutManager.SavedState[i];
            case 1:
                return new UserSessionCookie[i];
            case 2:
                return new ColorData[i];
            case 3:
                return new DspSpectrumRef[i];
            case 4:
                return new ZonePolicy[i];
            case 5:
                return new PushInfraMetaData[i];
            case 6:
                return new BeginSignInRequest[i];
            case 7:
                return new BeginSignInResult[i];
            case 8:
                return new GetSignInIntentRequest[i];
            case 9:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 10:
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            case 11:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            case 12:
                return new BeginSignInRequest.PasswordRequestOptions[i];
            case 13:
                return new SignInCredential[i];
            case 14:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 15:
                return new GoogleSignInAccount[i];
            case 16:
                return new GoogleSignInOptions[i];
            case 17:
                return new ClearRestoreCredentialRequest[i];
            case 18:
                return new GetRestoreCredentialRequest[i];
            case 19:
                return new ApiMetadata[i];
            case 20:
                return new ComplianceOptions[i];
            case 21:
                return new Scope[i];
            case 22:
                return new Status[i];
            case 23:
                return new DataHolder[i];
            case 24:
                return new ClientIdentity[i];
            case 25:
                return new TelemetryData[i];
            case 26:
                return new MethodInvocation[i];
            case 27:
                return new zat[i];
            case 28:
                return new zav[i];
            case 29:
                return new RootTelemetryConfiguration[i];
            case 30:
                return new zzk[i];
            case 31:
                return new ConnectionTelemetryConfiguration[i];
            case 32:
                return new GetServiceRequest[i];
            case 33:
                return new ApiFeatureRequest[i];
            case 34:
                return new ModuleAvailabilityResponse[i];
            case 35:
                return new ModuleInstallIntentResponse[i];
            case 36:
                return new ModuleInstallResponse[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return new ConnectionResult[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return new Feature[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return new Transport[i];
            case 40:
                return new PublicKeyCredential[i];
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return new UvmEntries[i];
            case 42:
                return new UvmEntry[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return new AuthenticationExtensionsClientOutputs[i];
            case 44:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return new zzf[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return new zzh[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return new AuthenticatorAssertionResponse[i];
            case 48:
                return new AuthenticatorAttestationResponse[i];
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return new AuthenticatorErrorResponse[i];
            case 50:
                return new ErrorCode[i];
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return new ClearCreationOptionsResponse[i];
            case 52:
                return new ClearCredentialStateRequest[i];
            case 53:
                return new ClearCredentialStateResponse[i];
            case 54:
                return new ClearExportResponse[i];
            case 55:
                return new ClearRegistryResponse[i];
            case 56:
                return new CreateCredentialHandle[i];
            case 57:
                return new CreateCredentialResponse[i];
            case 58:
                return new CredentialOption[i];
            case 59:
                return new CredentialTransferCapabilities[i];
            case 60:
                return new ExportCredentialsToDeviceSetupResponse[i];
            case 61:
                return new GetCredentialRequest[i];
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return new ImportCredentialsForDeviceSetupResponse[i];
            case 63:
                return new PendingGetCredentialHandle[i];
            case 64:
                return new PendingImportCredentialsHandle[i];
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return new RegisterCreationOptionsResponse[i];
            case 66:
                return new RegisterExportResponse[i];
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return new RegistrationResponse[i];
            case 68:
                return new SignalCredentialStateRequest[i];
            case 69:
                return new SignalCredentialStateResponse[i];
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                return new zzee[i];
            case 71:
                return new zzeg[i];
            case 72:
                return new zzei[i];
            case 73:
                return new zzek[i];
            case 74:
                return new zzem[i];
            case 75:
                return new zze[i];
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                return new zzl[i];
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                return new zzd[i];
            case 78:
                return new com.google.android.gms.internal.mlkit_vision_face.zzf[i];
            case 79:
                return new com.google.android.gms.internal.mlkit_vision_face.zzh[i];
            case 80:
                return new zzn[i];
            case 81:
                return new zzoq[i];
            case 82:
                return new zzos[i];
            case 83:
                return new zzou[i];
            case 84:
                return new zzow[i];
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                return new zzpc[i];
            case 86:
                return new zzp[i];
            case 87:
                return new com.google.android.gms.internal.mlkit_vision_label.zzh[i];
            case 88:
                return new zzj[i];
            case 89:
                return new com.google.android.gms.internal.mlkit_vision_label.zzl[i];
            case 90:
                return new zzod[i];
            case 91:
                return new zzoj[i];
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                return new zzol[i];
            case 93:
                return new LocationAvailability[i];
            case 94:
                return new LocationRequest[i];
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
                return new LocationResult[i];
            case 96:
                return new zzal[i];
            case 97:
                return new CurrentLocationRequest[i];
            case 98:
                return new GeofencingRequest[i];
            case 99:
                return new zaa[i];
            default:
                return BV4.A1W();
        }
    }

    public static PendingIntent A01(PendingIntent pendingIntent, Parcel parcel) {
        int i = parcel.readInt();
        if (((char) i) == 1) {
            return (PendingIntent) AbstractC4159CoF.A08(parcel, PendingIntent.CREATOR, i);
        }
        AbstractC4159CoF.A0E(parcel, i);
        return pendingIntent;
    }

    public static Bundle A02(Bundle bundle, Parcel parcel) {
        int i = parcel.readInt();
        if (((char) i) == 1) {
            return AbstractC4159CoF.A06(parcel, i);
        }
        AbstractC4159CoF.A0E(parcel, i);
        return bundle;
    }

    public static final ApiMetadata A04(Parcel parcel) {
        int iA00 = AbstractC4159CoF.A00(parcel);
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iA00) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                AbstractC4159CoF.A0E(parcel, i);
            } else {
                complianceOptions = (ComplianceOptions) AbstractC4159CoF.A08(parcel, ComplianceOptions.CREATOR, i);
            }
        }
        AbstractC4159CoF.A0D(parcel, iA00);
        return new ApiMetadata(complianceOptions);
    }

    public static void A05(Parcel parcel, GetServiceRequest getServiceRequest, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, getServiceRequest.A08);
        AbstractC4100CmU.A06(parcel, 2, getServiceRequest.A09);
        AbstractC4100CmU.A06(parcel, 3, getServiceRequest.A0A);
        AbstractC4100CmU.A0A(parcel, getServiceRequest.A03, 4);
        AbstractC4100CmU.A03(getServiceRequest.A02, parcel, 5);
        AbstractC4100CmU.A0E(parcel, getServiceRequest.A07, 6, i);
        AbstractC4100CmU.A02(getServiceRequest.A01, parcel, 7);
        AbstractC4100CmU.A09(parcel, getServiceRequest.A00, 8, i);
        AbstractC4100CmU.A0E(parcel, getServiceRequest.A05, 10, i);
        AbstractC4100CmU.A0E(parcel, getServiceRequest.A06, 11, i);
        AbstractC4100CmU.A08(parcel, 12, getServiceRequest.A0D);
        AbstractC4100CmU.A06(parcel, 13, getServiceRequest.A0B);
        AbstractC4100CmU.A08(parcel, 14, getServiceRequest.A04);
        AbstractC4100CmU.A0A(parcel, getServiceRequest.A0C, 15);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
