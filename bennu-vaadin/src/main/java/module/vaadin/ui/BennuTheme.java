/*
 * @(#)BennuTheme.java
 *
 * Copyright 2011 Instituto Superior Tecnico
 * Founding Authors: Pedro Santos
 * 
 *      https://fenix-ashes.ist.utl.pt/
 * 
 *   This file is part of the Bennu-Vadin Integration Module.
 *
 *   The Bennu-Vadin Integration Module is free software: you can
 *   redistribute it and/or modify it under the terms of the GNU Lesser General
 *   Public License as published by the Free Software Foundation, either version 
 *   3 of the License, or (at your option) any later version.
 *
 *   The Bennu-Vadin Module is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with the Bennu-Vadin Module. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package module.vaadin.ui;

import com.vaadin.ui.themes.BaseTheme;

/**
 * 
 * @author Pedro Santos
 * 
 */
public class BennuTheme extends BaseTheme {
    public static final String THEME_ALTERNATE_COLOR = "alternate-color";

    /***************************************************************************
     * Label styles
     **************************************************************************/

    /**
     * Large font for main application headings
     */
    public static final String LABEL_H1 = "h1";

    /**
     * Large font for different sections in the application
     */
    public static final String LABEL_H2 = "h2";

    /**
     * Font for sub-section headers
     */
    public static final String LABEL_H3 = "h3";

    /**
     * Font for paragraphs headers
     */
    public static final String LABEL_H4 = "h4";

    /**
     * Big font for important or emphasized texts
     */
    public static final String LABEL_BIG = "big";

    /**
     * Small and a little lighter font
     */
    public static final String LABEL_SMALL = "small";

    /**
     * Very small and lighter font for things such as footnotes and component
     * specific informations. Use carefully, since this style will usually
     * reduce legibility.
     */
    public static final String LABEL_TINY = "tiny";

    /**
     * Adds color to the text (usually the alternate color of the theme)
     */
    public static final String LABEL_COLOR = "color";

    /**
     * Adds a warning icon on the left side and a yellow background to the label
     */
    public static final String LABEL_WARNING = "warning";

    /**
     * Adds an error icon on the left side and a red background to the label
     */
    public static final String LABEL_ERROR = "error";

    /**
     * Adds a spinner icon on the left side of the label
     */
    public static final String LABEL_LOADING = "loading";

    /**
     * Wraps the text
     */
    public static final String LABEL_WRAP = "wrap";

    /***************************************************************************
     * Form styles
     **************************************************************************/

    public static final String FORM_INLINE = "inline";

    /***************************************************************************
     * Button styles
     **************************************************************************/

    /**
     * Default action style for buttons (the button that gets activated when
     * user presses 'enter' in a form). Use sparingly, only one default button
     * per screen should be visible.
     */
    public static final String BUTTON_DEFAULT = "default";

    /**
     * Small sized button, use for context specific actions for example
     */
    public static final String BUTTON_SMALL = "small";

    /**
     * Big button, use to get more attention for the button action
     */
    public static final String BUTTON_BIG = "big";

    /**
     * Adds more padding on the sides of the button. Makes it easier for the
     * user to hit the button.
     */
    public static final String BUTTON_WIDE = "wide";

    /**
     * Adds more padding on the top and on the bottom of the button. Makes it
     * easier for the user to hit the button.
     */
    public static final String BUTTON_TALL = "tall";

    /**
     * Removes all graphics from the button, leaving only the caption and the
     * icon visible. Useful for making icon-only buttons and toolbar buttons.
     */
    public static final String BUTTON_BORDERLESS = "borderless";

    /**
     * Places the button icon on top of the caption. By default the icon is on
     * the left side of the button caption.
     */
    public static final String BUTTON_ICON_ON_TOP = "icon-on-top";

    /**
     * Places the button icon on the right side of the caption. By default the
     * icon is on the left side of the button caption.
     */
    public static final String BUTTON_ICON_ON_RIGHT = "icon-on-right";

    /**
     * Removes the button caption and only shows its icon
     */
    public static final String BUTTON_ICON_ONLY = "icon-only";

    /**
     * Makes the button look like it is pressed down. Useful for creating a
     * toggle button.
     */
    public static final String BUTTON_DOWN = "down";

    /**
     * Caption of buttons wraps normally.
     */
    public static final String BUTTON_WRAP = "wraps";

    /**
     * No button appearance, only content
     */
    public static final String BUTTON_LIGHT = "light";

    /***************************************************************************
     * Link styles
     **************************************************************************/

    public static final String LINK_BIG = "big";

    public static final String LINK_WRAP = "wrap";

    /***************************************************************************
     * TextField styles
     **************************************************************************/

    /**
     * Small sized text field with small font
     */
    public static final String TEXTFIELD_SMALL = "small";

    /**
     * Large sized text field with big font
     */
    public static final String TEXTFIELD_BIG = "big";

    /**
     * Adds a magnifier icon on the left side of the fields text
     */
    public static final String TEXTFIELD_SEARCH = "search";

    /***************************************************************************
     * Select styles
     **************************************************************************/

    /**
     * Small sized select with small font
     */
    public static final String SELECT_SMALL = "small";

    /**
     * Large sized select with big font
     */
    public static final String SELECT_BIG = "big";

    /**
     * Adds a magnifier icon on the left side of the fields text
     */
    public static final String COMBOBOX_SEARCH = "search";

    /**
     * Adds a magnifier icon on the left side of the fields text
     */
    public static final String COMBOBOX_SELECT_BUTTON = "select-button";

    /***************************************************************************
     * DateField styles
     **************************************************************************/

    /**
     * Small sized date field with small font
     */
    public static final String DATEFIELD_SMALL = "small";

    /**
     * Large sized date field with big font
     */
    public static final String DATEFIELD_BIG = "big";

    /***************************************************************************
     * Panel styles
     **************************************************************************/

    /**
     * Removes borders and background color from the panel
     */
    public static final String PANEL_BORDERLESS = "borderless";

    /**
     * Adds a more vibrant header for the panel, using the alternate color of
     * the theme, and adds slight rounded corners (not supported in all
     * browsers)
     */
    // public static final String PANEL_BUBBLE = "bubble";

    /**
     * Removes borders and background color from the panel
     */
    public static final String PANEL_LIGHT = "light";

    /***************************************************************************
     * SplitPanel styles
     **************************************************************************/

    /**
     * Reduces the split handle to a minimal size (1 pixel)
     */
    public static final String SPLITPANEL_SMALL = "small";

    /***************************************************************************
     * TabSheet styles
     **************************************************************************/

    /**
     * Removes borders and background color from the tab sheet
     */
    public static final String TABSHEET_BORDERLESS = "borderless";

    /***************************************************************************
     * Accordion styles
     **************************************************************************/

    /**
     * Makes the accordion background opaque (non-transparent)
     */
    public static final String ACCORDION_OPAQUE = "opaque";

    /***************************************************************************
     * Table styles
     **************************************************************************/

    /**
     * Removes borders and background color from the table
     */
    public static final String TABLE_BORDERLESS = "borderless";

    /**
     * Makes the column header and content font size smaller inside the table
     */
    public static final String TABLE_SMALL = "small";

    /**
     * Makes the column header and content font size bigger inside the table
     */
    public static final String TABLE_BIG = "big";

    /**
     * Adds a light alternate background color to even rows in the table.
     */
    public static final String TABLE_STRIPED = "striped";

    public static final String TABLE_STRONG = "strong";

    /***************************************************************************
     * ProgressIndicator styles
     **************************************************************************/

    /**
     * Reduces the height of the progress bar
     */
    public static final String PROGRESS_INDICATOR_SMALL = "small";

    /**
     * Increases the height of the progress bar. If the indicator is in
     * indeterminate mode, shows a bigger spinner than the regular indeterminate
     * indicator.
     */
    public static final String PROGRESS_INDICATOR_BIG = "big";

    /**
     * Displays an indeterminate progress indicator as a bar with animated
     * background stripes. This style can be used in combination with the
     * "small" and "big" styles.
     */
    public static final String PROGRESS_INDICATOR_INDETERMINATE_BAR = "bar";

    /***************************************************************************
     * Layout styles
     **************************************************************************/

    /**
     * Wider spaced and margined layout
     */
    public static final String LAYOUT_BIG = "big";

    /**
     * Inset decoration for layouts
     */
    public static final String LAYOUT_INSET = "inset";

    /**
     * Layout that defines a page section, with a caption properly sized
     */
    public static final String LAYOUT_SECTION = "section";

    /**
     * Layout to be applied to the container of a page body
     */
    public static final String LAYOUT_PAGE = "page";

    /**
     * Layout that spans its contents horizontally with line wrapping.
     */
    public static final String LAYOUT_FLOW = "flow";

    /***************************************************************************
     * Window styles
     **************************************************************************/

    /**
     * Sub-window style that makes the window background opaque (i.e. not
     * semi-transparent).
     */
    public static final String WINDOW_OPAQUE = "opaque";

    /**
     * Makes the whole window white and increases the font size of the title.
     */
    public static final String WINDOW_LIGHT = "light";

    /**
     * Makes the whole window black, and changes contained components in the
     * same way as {@link #LAYOUT_BLACK} does.
     */
    public static final String WINDOW_BLACK = "black";

    /***************************************************************************
     * Compound styles
     **************************************************************************/

    /**
     * Creates a context for a segment button control. Place buttons inside the
     * segment, and add "<code>first</code>" and "<code>last</code>" style names
     * for the first and last button in the segment. Then use the {@link #BUTTON_DOWN} style to indicate button states.
     * 
     * E.g.
     * 
     * <pre class='code'>
     * HorizontalLayout ("segment")
     *   + Button ("first down")
     *   + Button ("down")
     *   + Button
     *    ...
     *   + Button ("last")
     * </pre>
     * 
     * You can also use most of the different button styles for the contained
     * buttons (e.g. {@link #BUTTON_BIG}, {@link #BUTTON_ICON_ONLY} etc.).
     */
    public static final String COMPOUND_HORIZONTAL_LAYOUT_SEGMENT = "segment";

    /**
     * Use this mixin-style in combination with the {@link #COMPOUND_HORIZONTAL_LAYOUT_SEGMENT} style to make buttons with
     * the "down" style use the themes alternate color (e.g. blue instead of
     * gray).
     * 
     * E.g.
     * 
     * <pre class='code'>
     * HorizontalLayout ("segment segment-alternate")
     *   + Button ("first down")
     *   + Button ("down")
     *   + Button
     *    ...
     *   + Button ("last")
     * </pre>
     */
    public static final String COMPOUND_HORIZONTAL_LAYOUT_SEGMENT_ALTERNATE = "segment-alternate";

    /**
     * Creates an iTunes-like menu from a CssLayout or a VerticalLayout. Place
     * plain Labels and NativeButtons inside the layout, and you're all set.
     * 
     * E.g.
     * 
     * <pre class='code'>
     * CssLayout ("sidebar-menu")
     *   + Label
     *   + NativeButton
     *   + NativeButton
     *    ...
     *   + Label
     *   + NativeButton
     * </pre>
     */
    public static final String COMPOUND_LAYOUT_SIDEBAR_MENU = "sidebar-menu";

    /**
     * Adds a toolbar-like background for the layout, and aligns Buttons and
     * Segments horizontally. Feel free to use different buttons styles inside
     * the toolbar, like {@link #BUTTON_ICON_ON_TOP} and {@link #BUTTON_BORDERLESS}
     */
    public static final String COMPOUND_CSSLAYOUT_TOOLBAR = "toolbar";

    /****************** Other */

    @Deprecated
    public static final String WIDE_FORM = "wide";

    @Deprecated
    public static final String TABLE_CLEAR = TABLE_BORDERLESS + " clear";

    @Deprecated
    public static final String WRAP = "text-wrap";

    @Deprecated
    public static final String PROPERTIES = "properties";

    @Deprecated
    public static final String PROPERTIES_LAST = "properties-last";

    @Deprecated
    public static final String PANEL_SECTION = "section";

    @Deprecated
    public static final String LABEL_STRONG = "strong";

    @Deprecated
    public static final String HORIZONTAL = "horizontal";
}
