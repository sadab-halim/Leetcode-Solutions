string interpret(string command) {
        string res;
        for(int i=0; i<command.size();){
            if(command[i] == 'G'){
                res += command[i];
                i += 1;
            } else if (command[i] == '(' && command[i+1] == ')'){
                res += "o";
                i += 2;
            } else {
                res += "al";
                i += 4;
            }
        }
        return res;
    }