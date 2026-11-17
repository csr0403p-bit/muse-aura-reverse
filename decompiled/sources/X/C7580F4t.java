package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.IResultReceiver$Stub$Proxy;
import android.support.v4.os.ResultReceiver;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.response.AggregateDataResponse;
import androidx.health.platform.client.response.GetChangesResponse;
import androidx.health.platform.client.response.GetChangesTokenResponse;
import androidx.health.platform.client.response.ReadDataRangeResponse;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashSet;

/* renamed from: X.F4t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7580F4t implements Parcelable.Creator {
    public final int $t;

    public C7580F4t(int i) {
        this.$t = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.support.v4.os.IResultReceiver] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        IResultReceiver$Stub$Proxy iResultReceiver$Stub$Proxy;
        int i;
        switch (this.$t) {
            case 0:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    iResultReceiver$Stub$Proxy = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IResultReceiver.A00);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) {
                        IResultReceiver$Stub$Proxy iResultReceiver$Stub$Proxy2 = new IResultReceiver$Stub$Proxy();
                        iResultReceiver$Stub$Proxy2.A00 = strongBinder;
                        iResultReceiver$Stub$Proxy = iResultReceiver$Stub$Proxy2;
                    } else {
                        iResultReceiver$Stub$Proxy = (IResultReceiver) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.A00 = iResultReceiver$Stub$Proxy;
                return resultReceiver;
            case 1:
                int iA03 = C7384Etj.A03(parcel);
                if (iA03 != 0) {
                    if (iA03 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA03);
                    }
                    i = 2;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                C9185Fzs c9185Fzs = (C9185Fzs) GF2.A00(C9185Fzs.DEFAULT_INSTANCE, bArrCreateByteArray);
                return ErrorStatus.A00((c9185Fzs.bitField0_ & 2) != 0 ? c9185Fzs.message_ : null, c9185Fzs.code_);
            case 2:
                int iA032 = C7384Etj.A03(parcel);
                if (iA032 != 0) {
                    if (iA032 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA032);
                    }
                    i = 3;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 != null) {
                    C9180Fzn c9180Fzn = (C9180Fzn) GF2.A00(C9180Fzn.DEFAULT_INSTANCE, bArrCreateByteArray2);
                    C7384Etj.A0X(c9180Fzn);
                    return new Permission(c9180Fzn);
                }
                return null;
            case 3:
                int iA033 = C7384Etj.A03(parcel);
                if (iA033 != 0) {
                    if (iA033 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA033);
                    }
                    i = 4;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                if (bArrCreateByteArray3 != null) {
                    C9170Fzd c9170Fzd = (C9170Fzd) GF2.A00(C9170Fzd.DEFAULT_INSTANCE, bArrCreateByteArray3);
                    C7384Etj.A0X(c9170Fzd);
                    return new AggregateDataRequest(c9170Fzd);
                }
                return null;
            case 4:
                int iA034 = C7384Etj.A03(parcel);
                if (iA034 != 0) {
                    if (iA034 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA034);
                    }
                    i = 5;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                if (bArrCreateByteArray4 != null) {
                    C9186Fzt c9186Fzt = (C9186Fzt) GF2.A00(C9186Fzt.DEFAULT_INSTANCE, bArrCreateByteArray4);
                    C7384Etj.A0X(c9186Fzt);
                    return new GetChangesRequest(c9186Fzt);
                }
                return null;
            case 5:
                int iA035 = C7384Etj.A03(parcel);
                if (iA035 != 0) {
                    if (iA035 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA035);
                    }
                    i = 6;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                if (bArrCreateByteArray5 != null) {
                    C9173Fzg c9173Fzg = (C9173Fzg) GF2.A00(C9173Fzg.DEFAULT_INSTANCE, bArrCreateByteArray5);
                    C7384Etj.A0X(c9173Fzg);
                    return new GetChangesTokenRequest(c9173Fzg);
                }
                return null;
            case 6:
                int iA036 = C7384Etj.A03(parcel);
                if (iA036 != 0) {
                    if (iA036 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA036);
                    }
                    i = 7;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray6 = parcel.createByteArray();
                if (bArrCreateByteArray6 != null) {
                    C9182Fzp c9182Fzp = (C9182Fzp) GF2.A00(C9182Fzp.DEFAULT_INSTANCE, bArrCreateByteArray6);
                    C7384Etj.A0X(c9182Fzp);
                    return new AggregateDataResponse(c9182Fzp);
                }
                return null;
            case 7:
                int iA037 = C7384Etj.A03(parcel);
                if (iA037 != 0) {
                    if (iA037 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA037);
                    }
                    i = 8;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray7 = parcel.createByteArray();
                if (bArrCreateByteArray7 != null) {
                    C9176Fzj c9176Fzj = (C9176Fzj) GF2.A00(C9176Fzj.DEFAULT_INSTANCE, bArrCreateByteArray7);
                    C7384Etj.A0X(c9176Fzj);
                    return new GetChangesResponse(c9176Fzj);
                }
                return null;
            case 8:
                int iA038 = C7384Etj.A03(parcel);
                if (iA038 != 0) {
                    if (iA038 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA038);
                    }
                    i = 9;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray8 = parcel.createByteArray();
                if (bArrCreateByteArray8 != null) {
                    C9189Fzw c9189Fzw = (C9189Fzw) GF2.A00(C9189Fzw.DEFAULT_INSTANCE, bArrCreateByteArray8);
                    C7384Etj.A0X(c9189Fzw);
                    return new GetChangesTokenResponse(c9189Fzw);
                }
                return null;
            case 9:
                int iA039 = C7384Etj.A03(parcel);
                if (iA039 != 0) {
                    if (iA039 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA039);
                    }
                    i = 10;
                    return AbstractC4101CmV.A00(parcel, new EY5(i));
                }
                byte[] bArrCreateByteArray9 = parcel.createByteArray();
                if (bArrCreateByteArray9 != null) {
                    C9177Fzk c9177Fzk = (C9177Fzk) GF2.A00(C9177Fzk.DEFAULT_INSTANCE, bArrCreateByteArray9);
                    C7384Etj.A0X(c9177Fzk);
                    return new ReadDataRangeResponse(c9177Fzk);
                }
                return null;
            case 10:
                return new DrmInitData(parcel);
            case 11:
                return new DrmInitData.SchemeData(parcel);
            case 12:
                return new StreamKey(parcel);
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                return new ViewerContext(parcel);
            case 15:
                return new CallerContext(parcel);
            case 16:
                return new OneoffTask(parcel);
            case 17:
                return new GraphQLError(parcel);
            case 18:
                return new ApiErrorResult(parcel);
            case 19:
                C7384Etj.A0Y(parcel, 0);
                return new ZonedValue(parcel);
            case 20:
                return new AudioFocusLossSettings(parcel);
            case 21:
                return new FirstDataSegmentCacheCheckEndEvent(parcel);
            case 22:
                return new FirstDataSegmentCacheCheckStartEvent(parcel);
            case 23:
                return new SpatialAudioFocusParams(parcel);
            case 24:
                return new SubtitleConfiguration(parcel);
            case 25:
                C7384Etj.A0Y(parcel, 0);
                String string = null;
                String string2 = parcel.readInt() != 0 ? parcel.readString() : null;
                String string3 = parcel.readInt() != 0 ? parcel.readString() : null;
                String string4 = parcel.readInt() != 0 ? parcel.readString() : null;
                String string5 = parcel.readInt() != 0 ? parcel.readString() : null;
                String string6 = parcel.readInt() != 0 ? parcel.readString() : null;
                String string7 = parcel.readInt() != 0 ? parcel.readString() : null;
                if (parcel.readInt() != 0 && (string = parcel.readString()) == null) {
                    throw C60O.A0i("Required value was null.");
                }
                String string8 = parcel.readInt() != 0 ? parcel.readString() : null;
                HashSet hashSetA13 = C60O.A13();
                int i2 = parcel.readInt();
                for (int i3 = 0; i3 < i2; i3++) {
                    String string9 = parcel.readString();
                    if (string9 == null) {
                        throw C60O.A0i("Required value was null.");
                    }
                    hashSetA13.add(string9);
                }
                return new FBPayLoggerData(string2, string3, string4, string5, string6, string7, string, string8, hashSetA13);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new ResultReceiver[i];
            case 1:
                return new ErrorStatus[i];
            case 2:
                return new Permission[i];
            case 3:
                return new AggregateDataRequest[i];
            case 4:
                return new GetChangesRequest[i];
            case 5:
                return new GetChangesTokenRequest[i];
            case 6:
                return new AggregateDataResponse[i];
            case 7:
                return new GetChangesResponse[i];
            case 8:
                return new GetChangesTokenResponse[i];
            case 9:
                return new ReadDataRangeResponse[i];
            case 10:
                return new DrmInitData[i];
            case 11:
                return new DrmInitData.SchemeData[i];
            case 12:
                return new StreamKey[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new ViewerContext[i];
            case 15:
                return new CallerContext[i];
            case 16:
                return new OneoffTask[i];
            case 17:
                return new GraphQLError[i];
            case 18:
                return new ApiErrorResult[i];
            case 19:
                return new ZonedValue[i];
            case 20:
                return new AudioFocusLossSettings[i];
            case 21:
                return new FirstDataSegmentCacheCheckEndEvent[i];
            case 22:
                return new FirstDataSegmentCacheCheckStartEvent[i];
            case 23:
                return new SpatialAudioFocusParams[i];
            case 24:
                return new SubtitleConfiguration[i];
            case 25:
                return new FBPayLoggerData[i];
            default:
                return BV4.A1W();
        }
    }
}
