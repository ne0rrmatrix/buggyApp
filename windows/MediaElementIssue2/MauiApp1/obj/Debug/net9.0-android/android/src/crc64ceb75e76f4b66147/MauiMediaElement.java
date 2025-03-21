package crc64ceb75e76f4b66147;


public class MauiMediaElement
	extends androidx.coordinatorlayout.widget.CoordinatorLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_onVisibilityChanged:(Landroid/view/View;I)V:GetOnVisibilityChanged_Landroid_view_View_IHandler\n" +
			"";
		mono.android.Runtime.register ("CommunityToolkit.Maui.Core.Views.MauiMediaElement, CommunityToolkit.Maui.MediaElement", MauiMediaElement.class, __md_methods);
	}

	public MauiMediaElement (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MauiMediaElement.class) {
			mono.android.TypeManager.Activate ("CommunityToolkit.Maui.Core.Views.MauiMediaElement, CommunityToolkit.Maui.MediaElement", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public MauiMediaElement (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MauiMediaElement.class) {
			mono.android.TypeManager.Activate ("CommunityToolkit.Maui.Core.Views.MauiMediaElement, CommunityToolkit.Maui.MediaElement", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public MauiMediaElement (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MauiMediaElement.class) {
			mono.android.TypeManager.Activate ("CommunityToolkit.Maui.Core.Views.MauiMediaElement, CommunityToolkit.Maui.MediaElement", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

	public void onVisibilityChanged (android.view.View p0, int p1)
	{
		n_onVisibilityChanged (p0, p1);
	}

	private native void n_onVisibilityChanged (android.view.View p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
