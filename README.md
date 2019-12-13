# SearchView

## Table of Contents

1. [Introduction](#introduction)
2. [History](#history)
3. [Major Methods/Attributes](#major-methods-attributes)
4. [Example Project Code](#example-project-code)
5. [References](#references)

## Introduction 

SearchView is a Android widget, that is capable of providing tools to search for a given context in a Android Studio mobile application environment. The widget provides a user interface equipped with a search bar, that allows users to query a particular selection or search for available results. The main purpose of this tool being to use a search provider to check for available results, if existing part of the service, or code. The results of the query can be based on internal code that is fixed into the searchbar(ex. a String value, holding characters,etc). This means, the widget automatically detects what the user wants to search for, by entering a letter or context specific to the desired selection. The search provider provides a list generated with all the available data at a specific time, and displays this data for the user to select, or view further details  on. There can also be instances, where a a user searches for a topic and is presented with valid suggestions to choose from,depending on what exists in the data interface.  SearchView is widely used with creating mobile applications, that require to search the internet to retrieve information on specific topics. This can be done through a delegated server, such as Firebase. The data can be stored into the database, and once the user enters a specific data type, the search provider would either provide valid results/suggestions available in a listed format(using ListView or Recyclerview layouts) part of the database/or vice-versa.In using this widget, the most common use occurs with the Actionbar. The searchbar sits on top of the ActionBar as the interface to take in all the input, and either find the right match or provide similar suggestions for the user experience. SearchView filters the results by data that is available through browsing for specifc content, or data that exists as part of a online database somewhere on the internet. The search provider acts as the basis of providing the results, and recommendations of what the user might want to query on next. For example,the widget provides ways to expand the experience by adding advanced features such as voice recognition. This can allow users to interact with their device and the search provider to gather results through verbal conversation,etc. 

## History

SearchView was introduced in API 11 of the Android system. The package library it mainly consisted of was the AppCompatActivity library, with backwards configuration back to Android 2.1. 

## Major Methods/Attributes

The major methods that are needed to use this widget are the following: 
- Method 1: public boolean onQueryTextSubmit(String query)
- Method 2: public boolean onQueryTextChange(String text)
- public int getImeOptions()
- public int getInputType()
- public CharSequence getQuery(): get the current query that is entered from the user in the SearchView, which is of string value
- public CharSequence getQueryHint(): dislays a hint for possible desired results the user may be wanting to search for
- public CursorAdapter getSuggestionsAdapter()
- public boolean isIconified()
- public boolean setIconifiedByDefault(true): this is when the searchbar is used as a ActionBar, to view as a action view. It provides the option of collapsing/expanding the view by changing the boolean value of this method to (true), and vice-versa for a fixed view of the searchview at all times.
- setOnSuggestionListener(SearchView.OnSuggestionListener listener) : this acknowledges when a suggestion is focused or clicked by the user, that pops up while the user is is typing or their is detection of inactivity on the view itself.
- setOnCloseListener : this sets a listener to be informed when the user closes the SearchView or the view is collapsed.
- setOnQueryTextFocusChangeListener(View.OnFocusChangeListner listner): this detects when the focus/context of the query changes in the searchbar or the user types in something new.
- setOnQueryTextListener : sets a listener for actions the user takes while using the view.
- setOnSearchClickListener: the view sets up a listener to be informed when the "Search" button is pressed 


So, onQueryTextSubmit is used to search a query based on waht the user types into the searchbar at the time of the submission. While, onQueryTextChange provides real-time updates of the user selections as they are typed into the searchbar layout. It basically searches the query, and automatically changes context if the user types a new letter, and as they enter new desired results, the searchview changes to the expected results from the query.There are 2 main types of methods used for the SearchView widget as mentioned here. 

### Attributes

- Id: this is used to identify a SearchView to be used later on for other purposes.
- queryHint - this sets a query hint using a String, in the SearchView.
- iconifiedByDefault - sets a true(expandable view for the view) or, default state where the the SearchView is visible at all times.
- background - this can be used to set a specific background color for the SearchView, or image.
- padding - allows the View to be constrained and be put in the center,or any where on the screen. Ideally, it should be placed on the top of a Toolbar.


## Example Project Code

### Methods Used

```
            @Override
            public boolean onQueryTextSubmit(String query) { // when the query is submitted
                Toast.makeText(getApplicationContext(), "You searched" + query,Toast.LENGTH_SHORT).show(); // display this toast message with the query that is entered by the user
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) { // used to check query and automatically change context while the user types into the searchbar
                adapter.getFilter().filter(newText); // takes the items in the list, and filters through the listview,only showing the filtered items
                Toast.makeText(getApplicationContext(), "Were you trying to search for.." + list1 + "?", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


```
### Attributes Used
```

 android:queryHint="Search Courses"
 android:iconifiedByDefault="true"

```

## References

* https://developer.android.com/reference/android/widget/SearchView
* https://androidmonks.com/searchview/

