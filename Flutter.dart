Terminal 

open -a Simulator => opens Xcode simulator 
https://github.com/hnvn/flutter_shimmer

DART FLUTTER 
New is optional in DART 2

RawMaterialButton => shape : const StadiumBorder
Style : TextStyle => color , size 
Padding : EdgeInsets.ymmetric(
Vertical : , 
Horizontal :
)

//Widgets and attributes.

mainAxisSize : MainAxisSize.min => makes the widgets use the less space it can
SizedBox(width : 80 , height : 80) => widget used for spaces between other widgets

GestureDetecotr => wraps others => {child : new Text() , onTap : _Function } others for listeners like tapes long taps 

Wrap = row => but when the children take more then the screen it will fit them

RotatedBox => wraps others => has -> quarterTurn : 3 => makes any widget or set of widgets rotate
Right Click -> remove Widget => remove a widget

crossAxisAlignment : CrossAxisAlignment.start => like gravity="start" in android


Column = vertical linearLayout 
new Divider() => is the black line between list view rows!


// Code snippets.

OnPressed : () {   //=> Inside the element
Some code
},

If setState (){} // gets called the code and design get evaluated again so call it when doing changes like this 

onPressed: (){
              print("Reloading....!");
              setState(() {
                _isLoading = !_isLoading;
              });
              },


functionName () async { // this async telling the os that this will take time and we will use await
Await 
}


In pub =>  dependencies:
 http: ^0.12.0+2

import 'package:http/http.dart' as http;

// Fetching Data from an API

  _fetchData() async{
    final String url = "https://api.letsbuildthatapp.com/youtube/home_feed";
    final response = await http.get(url);

    if(response.statusCode == 200 ) { // meaning that the connection is done will "ok"
        print(response.body);
    }
  }


//Dummy ListView
new ListView.builder(
              itemCount: 50,
              itemExtent: 40, // the height of each row
              itemBuilder: (context,i){
                //here we return the Row design which "i" is the Row number
                return new Text("Row : $i");
              },



// want onPressed callback for any widget ?? => wrap it with FlatButton which will take the look of whatever is inside it
RaisedButton => simple button

// text styles = textAppearance(in android) => makes the font bigger as a headline
Style : Theme.of(context).textTheme.headline 


// a Container has a Padding and alignment attribute 
Alignment : Alignment.centerLeft. // makes the view centred vertically and in the left 'start' of the screen


// Flutter themeData  => this will theme the app  
Return MaterialApp (
Theme : ThemeData(
   
  primarySwatch : Colors.red , 
  Buttoncolor : Colors.yellow, // 
  ButtonTheme : const ButtonThemeData (textTheme : ButtonTextTheme.primary), // primary is white => here we set the text color of all button to white   

),)


// intent  = navigator

Navigator.of(context).pop(); // this will dismiss or finish this context you are in so if you are in an activity will cal finish this context but won't get out 
// but will get you in a blank context of ur app , if in dialog will dismiss it.


// intent for going to another activity
Navigator.push(context,
                            new MaterialPageRoute(
                              builder: (context) => new detailesPage(),
                            )
                        );





// gravity => 
align(
Alignment : alignment.centerlef = alignment.centerright,
Child : // here your container or row 'wrap' or column, 
)



// contentPadding : EdgeInsets.zero // removes caldrons paddings

// image.network (
Url,
Fit :BoxFit.fill

)





















