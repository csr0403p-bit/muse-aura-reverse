package X;

import X.C10638I0i;
import X.C60O;
import X.C8j3;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import androidx.health.platform.client.request.RequestContext;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import java.util.Calendar;

/* renamed from: X.I0i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10638I0i implements Parcelable.Creator {
    public final int $t;

    public C10638I0i(int i) {
        this.$t = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        Uri mediaUri;
        int i;
        switch (this.$t) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C10638I0i(0);
                    public final int A00;
                    public final MediaDescriptionCompat A01;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sbA0x = C60O.A0x("MediaItem{mFlags=");
                        sbA0x.append(this.A00);
                        sbA0x.append(", mDescription=");
                        sbA0x.append(this.A01);
                        return C8j3.A15(sbA0x);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeInt(this.A00);
                        this.A01.writeToParcel(parcel2, i2);
                    }

                    {
                        this.A00 = parcel.readInt();
                        this.A01 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                Bundle bundle2 = null;
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras == null) {
                    bundle = null;
                } else {
                    C8852FrD.A00(extras);
                    try {
                        extras.isEmpty();
                        bundle = new Bundle(extras);
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                        bundle = null;
                    }
                }
                if (bundle != null) {
                    mediaUri = (Uri) bundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (mediaUri != null) {
                        if (!bundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundle.size() != 2) {
                            bundle.remove("android.support.v4.media.description.MEDIA_URI");
                            bundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                    }
                    MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(iconBitmap, iconUri, mediaUri, bundle2, title, subtitle, description, mediaId);
                    mediaDescriptionCompat.A00 = mediaDescription;
                    return mediaDescriptionCompat;
                }
                mediaUri = null;
                bundle2 = bundle;
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(iconBitmap, iconUri, mediaUri, bundle2, title, subtitle, description, mediaId);
                mediaDescriptionCompat2.A00 = mediaDescription;
                return mediaDescriptionCompat2;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.A00 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                return new MediaSessionCompat$Token(null, parcel.readParcelable(null));
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.A04 = parcel.readInt();
                parcelableVolumeInfo.A01 = parcel.readInt();
                parcelableVolumeInfo.A03 = parcel.readInt();
                parcelableVolumeInfo.A02 = parcel.readInt();
                parcelableVolumeInfo.A00 = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 10:
                return new ActivityResult(C7384Etj.A03(parcel), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 11:
                C7384Etj.A0Y(parcel, 0);
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                C7384Etj.A0X(parcelable);
                return new IntentSenderRequest((Intent) parcel.readParcelable(Intent.class.getClassLoader()), (IntentSender) parcelable, parcel.readInt(), parcel.readInt());
            case 12:
                AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(parcel);
                appCompatSpinner$SavedState.A00 = AnonymousClass002.A1L(parcel.readByte());
                return appCompatSpinner$SavedState;
            case 13:
                NestedScrollView.SavedState savedState = new NestedScrollView.SavedState(parcel);
                savedState.A00 = parcel.readInt();
                return savedState;
            case 14:
                return new BackStackRecordState(parcel);
            case 15:
                return new BackStackState(parcel);
            case 16:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.A01 = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.A00 = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 17:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.A01 = null;
                fragmentManagerState.A04 = C3cG.A0h();
                fragmentManagerState.A05 = C3cG.A0h();
                fragmentManagerState.A02 = parcel.createStringArrayList();
                fragmentManagerState.A03 = parcel.createStringArrayList();
                fragmentManagerState.A07 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.A00 = parcel.readInt();
                fragmentManagerState.A01 = parcel.readString();
                fragmentManagerState.A04 = parcel.createStringArrayList();
                fragmentManagerState.A05 = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.A06 = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            case 18:
                return new FragmentState(parcel);
            case 19:
                int iA03 = C7384Etj.A03(parcel);
                if (iA03 != 0) {
                    if (iA03 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA03);
                    }
                    i = 2;
                    return AbstractC4101CmV.A00(parcel, C8631Fhi.A00(i));
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray != null) {
                    C9171Fze c9171Fze = (C9171Fze) GF2.A00(C9171Fze.DEFAULT_INSTANCE, bArrCreateByteArray);
                    C7384Etj.A0X(c9171Fze);
                    return new ReadDataRangeRequest(c9171Fze);
                }
                return null;
            case 20:
                int iA032 = C7384Etj.A03(parcel);
                if (iA032 != 0) {
                    if (iA032 != 1) {
                        throw BV5.A0Q("Unknown storage: ", iA032);
                    }
                    i = 3;
                    return AbstractC4101CmV.A00(parcel, C8631Fhi.A00(i));
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 != null) {
                    G0L g0l = (G0L) GF2.A00(G0L.DEFAULT_INSTANCE, bArrCreateByteArray2);
                    String str = g0l.callingPackage_;
                    C7384Etj.A0U(str);
                    return new RequestContext(str, g0l.sdkVersion_, g0l.permissionToken_, g0l.isInForeground_);
                }
                return null;
            case 21:
                LinearLayoutManager.SavedState savedState2 = new LinearLayoutManager.SavedState();
                savedState2.A01 = parcel.readInt();
                savedState2.A00 = parcel.readInt();
                savedState2.A02 = BV7.A1Q(parcel.readInt());
                return savedState2;
            case 22:
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 = parcel.readInt();
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A00 = parcel.readInt();
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A02 = BV7.A1Q(parcel.readInt());
                int i2 = parcel.readInt();
                if (i2 <= 0) {
                    return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
                }
                int[] iArr = new int[i2];
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A03 = iArr;
                parcel.readIntArray(iArr);
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            case 23:
                StaggeredGridLayoutManager.SavedState savedState3 = new StaggeredGridLayoutManager.SavedState();
                savedState3.A00 = parcel.readInt();
                savedState3.A03 = parcel.readInt();
                int i3 = parcel.readInt();
                savedState3.A02 = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    savedState3.A09 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                savedState3.A01 = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    savedState3.A08 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                savedState3.A07 = AnonymousClass002.A1Q(parcel.readInt(), 1);
                savedState3.A05 = AnonymousClass002.A1Q(parcel.readInt(), 1);
                savedState3.A06 = parcel.readInt() == 1;
                savedState3.A04 = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
                return savedState3;
            case 24:
                return new SwipeRefreshLayout$SavedState(parcel);
            case 25:
                return new HttpTransferRequestedEvent(parcel);
            case 26:
                Month month = (Month) parcel.readParcelable(Month.class.getClassLoader());
                Month month2 = (Month) parcel.readParcelable(Month.class.getClassLoader());
                Month month3 = (Month) parcel.readParcelable(Month.class.getClassLoader());
                parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader());
                return new CalendarConstraints(month, month2, month3);
            case 27:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Calendar calendarA0y = AbstractC7609F5w.A0y();
                calendarA0y.set(1, i5);
                calendarA0y.set(2, i6);
                return new Month(calendarA0y);
            case 28:
                InterfaceC8011FPi interfaceC8011FPi = (InterfaceC8011FPi) Hi4.A02(InterfaceC8011FPi.class, Integer.valueOf(C7384Etj.A03(parcel)));
                if (interfaceC8011FPi == null) {
                    Hx0.A00();
                    interfaceC8011FPi = C8080FSk.A00;
                }
                return new CdsOpenScreenCallerDismissCallback(interfaceC8011FPi);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new ActivityResult[i];
            case 11:
                return new IntentSenderRequest[i];
            case 12:
                return new AppCompatSpinner$SavedState[i];
            case 13:
                return new NestedScrollView.SavedState[i];
            case 14:
                return new BackStackRecordState[i];
            case 15:
                return new BackStackState[i];
            case 16:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 17:
                return new FragmentManagerState[i];
            case 18:
                return new FragmentState[i];
            case 19:
                return new ReadDataRangeRequest[i];
            case 20:
                return new RequestContext[i];
            case 21:
                return new LinearLayoutManager.SavedState[i];
            case 22:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 23:
                return new StaggeredGridLayoutManager.SavedState[i];
            case 24:
                return new SwipeRefreshLayout$SavedState[i];
            case 25:
                return new HttpTransferRequestedEvent[i];
            case 26:
                return new CalendarConstraints[i];
            case 27:
                return new Month[i];
            case 28:
                return new CdsOpenScreenCallerDismissCallback[i];
            default:
                return BV4.A1W();
        }
    }
}
