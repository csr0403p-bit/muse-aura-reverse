package X;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.util.Log;

/* renamed from: X.FrB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8850FrB extends MediaSession.Callback {
    public final /* synthetic */ AbstractC8851FrC A00;

    public C8850FrB(AbstractC8851FrC abstractC8851FrC) {
        this.A00 = abstractC8851FrC;
    }

    private C8853FrI A00() {
        C8853FrI c8853FrI;
        AbstractC8851FrC abstractC8851FrC;
        AbstractC8851FrC abstractC8851FrC2 = this.A00;
        synchronized (abstractC8851FrC2.mLock) {
            c8853FrI = (C8853FrI) abstractC8851FrC2.mSessionImpl.get();
        }
        if (c8853FrI == null) {
            return null;
        }
        synchronized (c8853FrI.A08) {
            abstractC8851FrC = c8853FrI.A01;
        }
        if (abstractC8851FrC2 == abstractC8851FrC) {
            return c8853FrI;
        }
        return null;
    }

    public static void A01(Bundle bundle, C8850FrB c8850FrB) {
        C8853FrI c8853FrIA00 = c8850FrB.A00();
        if (c8853FrIA00 != null) {
            C8852FrD.A00(bundle);
            c8853FrIA00.AdD(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[Catch: BadParcelableException -> 0x0076, TRY_LEAVE, TryCatch #0 {BadParcelableException -> 0x0076, blocks: (B:5:0x0009, B:7:0x0012, B:8:0x001a, B:13:0x0022, B:14:0x0026, B:15:0x002b, B:21:0x0041, B:20:0x0033, B:27:0x004e, B:28:0x004f, B:31:0x0059, B:34:0x0063, B:35:0x006a, B:37:0x0072), top: B:41:0x0009 }] */
    @Override // android.media.session.MediaSession.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
        /*
            r5 = this;
            X.FrI r3 = r5.A00()
            if (r3 == 0) goto L81
            X.C8852FrD.A00(r7)
            java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
            boolean r0 = r6.equals(r0)     // Catch: android.os.BadParcelableException -> L76
            r5 = 0
            if (r0 == 0) goto L4f
            android.os.Bundle r6 = X.BV6.A0N()     // Catch: android.os.BadParcelableException -> L76
            android.support.v4.media.session.MediaSessionCompat$Token r4 = r3.A07     // Catch: android.os.BadParcelableException -> L76
            java.lang.Object r2 = r4.A03     // Catch: android.os.BadParcelableException -> L76
            monitor-enter(r2)     // Catch: android.os.BadParcelableException -> L76
            android.support.v4.media.session.IMediaSession r1 = r4.A00     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "android.support.v4.media.session.EXTRA_BINDER"
            if (r1 == 0) goto L26
            android.os.IBinder r5 = r1.asBinder()     // Catch: android.os.BadParcelableException -> L76
        L26:
            r6.putBinder(r0, r5)     // Catch: android.os.BadParcelableException -> L76
            java.lang.String r5 = "android.support.v4.media.session.SESSION_TOKEN2"
            monitor-enter(r2)     // Catch: android.os.BadParcelableException -> L76
            X.E1K r4 = r4.A01     // Catch: java.lang.Throwable -> L49
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L33
            r2 = 0
            goto L41
        L33:
            android.os.Bundle r2 = X.BV6.A0N()     // Catch: android.os.BadParcelableException -> L76
            java.lang.String r1 = "a"
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl     // Catch: android.os.BadParcelableException -> L76
            r0.<init>(r4)     // Catch: android.os.BadParcelableException -> L76
            r2.putParcelable(r1, r0)     // Catch: android.os.BadParcelableException -> L76
        L41:
            r6.putParcelable(r5, r2)     // Catch: android.os.BadParcelableException -> L76
            r0 = 0
            r8.send(r0, r6)     // Catch: android.os.BadParcelableException -> L76
            goto L7d
        L49:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            goto L4e
        L4c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
        L4e:
            throw r0     // Catch: android.os.BadParcelableException -> L76
        L4f:
            java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
            boolean r0 = r6.equals(r0)     // Catch: android.os.BadParcelableException -> L76
            java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
            if (r0 != 0) goto L72
            java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
            boolean r1 = r6.equals(r0)     // Catch: android.os.BadParcelableException -> L76
            java.lang.String r0 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
            if (r1 == 0) goto L6a
            r7.getParcelable(r2)     // Catch: android.os.BadParcelableException -> L76
            r7.getInt(r0)     // Catch: android.os.BadParcelableException -> L76
            goto L7d
        L6a:
            java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
            boolean r0 = r6.equals(r0)     // Catch: android.os.BadParcelableException -> L76
            if (r0 == 0) goto L7d
        L72:
            r7.getParcelable(r2)     // Catch: android.os.BadParcelableException -> L76
            goto L7d
        L76:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r0 = "Could not unparcel the extra data."
            android.util.Log.e(r1, r0)
        L7d:
            r0 = 0
            r3.AdD(r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8850FrB.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            C8852FrD.A00(bundle);
            try {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    C8852FrD.A00(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        C8852FrD.A00(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        C8852FrD.A00(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        C8852FrD.A00(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        C8852FrD.A00(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        this.A00.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onFastForward();
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 == null) {
            return false;
        }
        c8853FrIA00.AdD(null);
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onPause();
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onPlay();
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onRewind();
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onSeekTo(j);
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onSetPlaybackSpeed(f);
            c8853FrIA00.AdD(null);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0012. Please report as an issue. */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float starRating;
        RatingCompat ratingCompat;
        float percentRating;
        int i;
        float f;
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            if (rating != null) {
                int ratingStyle = rating.getRatingStyle();
                if (!rating.isRated()) {
                    switch (ratingStyle) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            starRating = -1.0f;
                            ratingCompat = new RatingCompat(ratingStyle, starRating);
                            break;
                        default:
                            ratingCompat = null;
                            break;
                    }
                } else {
                    switch (ratingStyle) {
                        case 1:
                            percentRating = rating.hasHeart() ? 1.0f : 0.0f;
                            i = 1;
                            ratingCompat = new RatingCompat(i, percentRating);
                            break;
                        case 2:
                            percentRating = rating.isThumbUp() ? 1.0f : 0.0f;
                            i = 2;
                            ratingCompat = new RatingCompat(i, percentRating);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            starRating = rating.getStarRating();
                            ratingCompat = null;
                            if (ratingStyle != 3) {
                                f = 4.0f;
                                if (ratingStyle != 4) {
                                    f = 5.0f;
                                }
                            } else {
                                f = 3.0f;
                            }
                            if (starRating >= 0.0f && starRating <= f) {
                                ratingCompat = new RatingCompat(ratingStyle, starRating);
                                break;
                            } else {
                                Log.e("Rating", "Trying to set out of range star-based rating");
                                break;
                            }
                            break;
                        case 6:
                            percentRating = rating.getPercentRating();
                            if (percentRating >= 0.0f && percentRating <= 100.0f) {
                                i = 6;
                                ratingCompat = new RatingCompat(i, percentRating);
                                break;
                            } else {
                                Log.e("Rating", "Invalid percentage-based rating value");
                                ratingCompat = null;
                                break;
                            }
                            break;
                    }
                }
                ratingCompat.A00 = rating;
            }
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C8853FrI c8853FrIA00 = A00();
        if (c8853FrIA00 != null) {
            this.A00.onStop();
            c8853FrIA00.AdD(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        A01(bundle, this);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        A01(bundle, this);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        A01(bundle, this);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        A01(bundle, this);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        A01(bundle, this);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        A01(bundle, this);
    }
}
